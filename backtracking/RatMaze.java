package backtracking;

public class RatMaze {

    public static boolean findways(int maze[][], int x, int y, int path[][], boolean visited[][]) {
        int n = maze.length;

        if (x == n - 1 && y == n - 1) {
            path[x][y] = 1;
            return true;
        }

        if (!isSafe(maze, x, y, visited)) {
            return false;
        }

        visited[x][y] = true;
        path[x][y] = 1;

        // Down
        if (findways(maze, x + 1, y, path, visited)) {
            return true;
        }

        // Right
        if (findways(maze, x, y + 1, path, visited)) {
            return true;
        }

        // Up
        if (findways(maze, x - 1, y, path, visited)) {
            return true;
        }

        // Left
        if (findways(maze, x, y - 1, path, visited)) {
            return true;
        }

        visited[x][y] = false;
        path[x][y] = 0;

        return false;
    }

    public static boolean isSafe(int maze[][], int x, int y, boolean visited[][]) {
        int n = maze.length;

        if (x < 0 || x >= n || y < 0 || y >= n) {
            return false;
        }

        if (maze[x][y] == 0 || visited[x][y]) {
            return false;
        }

        return true;
    }

    public static void print(int path[][]) {
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[0].length; j++) {
                System.out.print(path[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int maze[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int n = maze.length;
        int path[][] = new int[n][n];
        boolean visited[][] = new boolean[n][n];

        if (findways(maze, 0, 0, path, visited)) {
            print(path);
        } else {
            System.out.println("No Path");
        }
    }
}