import java.util.*;

public class CargoShipping1 {

    public static void cargoShipping() {
        Scanner sc = new Scanner(System.in);

        // Read number of junctions
        int N = Integer.parseInt(sc.nextLine().trim());
        Map<String, List<String>> network = new HashMap<>();

        // Read the network of junctions
        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(" ");
            String junction = line[0];
            List<String> connections = Arrays.asList(Arrays.copyOfRange(line, 1, line.length));
            network.put(junction, connections);
        }

        // Read gates and costs
        String[] gates = sc.nextLine().split(" ");
        int[] costs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int K = Integer.parseInt(sc.nextLine().trim());

        // Switches map to track the number of times a junction has been visited
        Map<String, Integer> switches = new HashMap<>();
        for (String junction : network.keySet()) {
            switches.put(junction, 0);
        }

        int totalCost = 0;

        // Process each gate
        for (int idx = 0; idx < gates.length; idx++) {
            String gate = gates[idx];
            List<String> path = new ArrayList<>();
            String currentJunction = gate;

            while (!currentJunction.equals("warehouse")) {
                path.add(currentJunction);
                List<String> connections = network.get(currentJunction);

                if (connections == null || connections.isEmpty()) {
                    path.add("warehouse");
                    break;
                }

                String nextJunction = null;
                for (String connection : connections) {
                    if (!connection.equals("warehouse") && network.containsKey(connection)) {
                        nextJunction = connection;
                        break;
                    }
                }

                if (nextJunction == null) {
                    path.add("warehouse");
                    break;
                }

                currentJunction = nextJunction;
            }

            boolean manualShiftingNeeded = false;
            for (String junction : path) {
                // Use getOrDefault to avoid NullPointerException if a junction doesn't exist in the map
                if (switches.getOrDefault(junction, 0) >= K) {
                    manualShiftingNeeded = true;
                    break;
                }
            }

            if (manualShiftingNeeded) {
                totalCost += costs[idx];
            } else {
                for (String junction : path) {
                    switches.put(junction, switches.getOrDefault(junction, 0) + 1);
                }
            }
        }

        System.out.println(totalCost);
    }

    // Main method to call the cargoShipping method
    public static void main(String[] args) {
        cargoShipping();
    }
}
