import java.util.*;
import java.util.stream.*;
class Stream_AE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Reading> readings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            double temp = sc.nextDouble();
            readings.add(new Reading(id, temp));
        }
        readings.stream()
                .filter(r -> r.temperature > 50)
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingDouble(r -> r.temperature)
                ))
                .entrySet()
                .stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
    static class Reading {
        String sensorId;
        double temperature;
        Reading(String sensorId, double temperature) {
            this.sensorId = sensorId;
            this.temperature = temperature;
        }
    }
}