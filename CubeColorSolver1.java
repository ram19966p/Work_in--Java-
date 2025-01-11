import java.util.*;

public class CubeColorSolver {

    static String[][][] cube;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();

        
      cube = new String[6][N][N];
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < N; j++) {
            if (sc.hasNextLine()) {
              cube[i][j] = sc.nextLine().split(" ");
                 } else {
                System.out.println("Error: Missing data for cube face " + i);
                  return;
               }
            }
        }


        String[] rotations = new String[K];
        for (int i = 0; i < K; i++) {
            rotations[i] = sc.nextLine();
        }

       
        String[] query = sc.nextLine().split(" ");
        int side = Integer.parseInt(query[0]) - 1;
        int row = Integer.parseInt(query[1]) - 1;
        int col = Integer.parseInt(query[2]) - 1;

       
        for (String rotation : rotations) {
            rotateCube(rotation, N);
        }

      
        System.out.println(cube[side][row][col]);
        sc.close();
    }

    private static void rotateCube(String rotation, int N) {
        switch (rotation) {
            case "turn left":
                turnLeft(N);
                break;
            case "turn right":
                turnRight(N);
                break;
            case "rotate front":
                rotateFront(N);
                break;
            case "rotate back":
                rotateBack(N);
                break;
            case "rotate left":
                rotateLeft(N);
                break;
            case "rotate right":
                rotateRight(N);
                break;
        }
    }

    private static void turnLeft(int N) {
       
        String[][] temp = cube[3];
        cube[3] = cube[5];
        cube[5] = cube[1];
        cube[1] = cube[4];
        cube[4] = temp;


        rotateFaceRight(cube[2], N);
        rotateFaceLeft(cube[0], N);
    }

    private static void turnRight(int N) {
        
        String[][] temp = cube[3];
        cube[3] = cube[4];
        cube[4] = cube[1];
        cube[1] = cube[5];
        cube[5] = temp;

        
        rotateFaceLeft(cube[2], N);
        rotateFaceRight(cube[0], N);
    }

    private static void rotateFront(int N) {
        
        String[][] temp = cube[3];
        cube[3] = cube[2];
        cube[2] = cube[1];
        cube[1] = cube[0];
        cube[0] = temp;

       
        rotateFaceRight(cube[4], N);
        rotateFaceLeft(cube[5], N);
    }

    private static void rotateBack(int N) {
     
        String[][] temp = cube[3];
        cube[3] = cube[0];
        cube[0] = cube[1];
        cube[1] = cube[2];
        cube[2] = temp;

        
        rotateFaceLeft(cube[4], N);
        rotateFaceRight(cube[5], N);
    }

    private static void rotateLeft(int N) {
        
        String[][] temp = cube[2];
        cube[2] = cube[5];
        cube[5] = cube[0];
        cube[0] = cube[4];
        cube[4] = temp;

        
        rotateFaceLeft(cube[3], N);
        rotateFaceRight(cube[1], N);
    }

    private static void rotateRight(int N) {
       
        String[][] temp = cube[2];
        cube[2] = cube[4];
        cube[4] = cube[0];
        cube[0] = cube[5];
        cube[5] = temp;


        rotateFaceRight(cube[3], N);
        rotateFaceLeft(cube[1], N);
    }

    private static void rotateFaceRight(String[][] face, int N) {
        String[][] temp = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[j][N - 1 - i] = face[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            System.arraycopy(temp[i], 0, face[i], 0, N);
        }
    }

    private static void rotateFaceLeft(String[][] face, int N) {
        String[][] temp = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[N - 1 - j][i] = face[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            System.arraycopy(temp[i], 0, face[i], 0, N);
        }
    }
}
