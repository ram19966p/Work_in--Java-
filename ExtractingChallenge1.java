import java.util.*;

public class ExtractingChallenge1 {

    static int R, C, S, N;
    static boolean[][] grid, extracted;
    static int totalExtractedArea = 0;
    static int numPlacements = 0;
    
    // Represents a line segment
    static class Line {
        int x1, y1, x2, y2;
        
        Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    static List<Line> lines = new ArrayList<>();
    
    // Initialize the grid with shapes based on the lines
    static void initializeGrid() {
        grid = new boolean[R + 1][C + 1];
        
        for (Line line : lines) {
            if (line.x1 == line.x2) {
                // Vertical line
                for (int y = Math.min(line.y1, line.y2); y <= Math.max(line.y1, line.y2); y++) {
                     if (line.x1 >= 0 && line.x1 <= R && y >= 0 && y <= C) {  // Ensure the indices are within bounds
                    grid[line.x1][y] = true;
                }
                }
            } else if (line.y1 == line.y2) {
                // Horizontal line
                for (int x = Math.min(line.x1, line.x2); x <= Math.max(line.x1, line.x2); x++) {
                   if (x >= 0 && x <= R && line.y1 >= 0 && line.y1 <= C) {  // Ensure the indices are within bounds
                    grid[x][line.y1] = true;
                }
                }
            }
        }
    }
    
    // Check if a block can be placed at (x, y) on the grid
    static boolean canPlaceBlock(int x, int y) {
        for (int i = x; i < x + S; i++) {
            for (int j = y; j < y + S; j++) {
                if (i >= R || j >= C || !grid[i][j] || extracted[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Extract shapes by placing a block at (x, y)
    static int extractShapes(int x, int y) {
        int extractedShapes = 0;
        for (int i = x; i < x + S; i++) {
            for (int j = y; j < y + S; j++) {
                if (i < R && j < C && grid[i][j] && !extracted[i][j]) {
                    extracted[i][j] = true;
                    extractedShapes++;
                }
            }
        }
        return extractedShapes;
    }
    
    // Greedily extract all shapes using the block
    static void extractAllShapes() {
        while (true) {
            int bestX = -1, bestY = -1, maxExtracted = 0;
            
            // Try all possible placements of the block
            for (int i = 0; i <= R - S; i++) {
                for (int j = 0; j <= C - S; j++) {
                    if (canPlaceBlock(i, j)) {
                        int extractedShapes = extractShapes(i, j);
                        if (extractedShapes > maxExtracted) {
                            maxExtracted = extractedShapes;
                            bestX = i;
                            bestY = j;
                        }
                    }
                }
            }
            
            // If no more shapes can be extracted, stop
            if (maxExtracted == 0) {
                break;
            }
            
            // Update the total extracted area and the number of placements
            totalExtractedArea += maxExtracted;
            numPlacements++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input reading
        C = sc.nextInt();  // Number of columns
        R = sc.nextInt();  // Number of rows
        S = sc.nextInt();  // Size of the block
        N = sc.nextInt();  // Number of lines

        // Read the line segments
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            lines.add(new Line(x1, y1, x2, y2));
        }
        
        // Initialize the grid with shapes
        initializeGrid();
        
        // Initialize the extracted grid
        extracted = new boolean[R + 1][C + 1];
        
        // Perform the extraction process
        extractAllShapes();
        
        // Output the result
        System.out.println(numPlacements + " " + totalExtractedArea);
        
        sc.close();
    }
}
