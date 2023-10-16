package java1710;

import java.util.Scanner;

public class B8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] points = new int[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter x coordinate for point " + (i + 1) + ": ");
            points[i][0] = sc.nextInt();
            System.out.print("Enter y coordinate for point " + (i + 1) + ": ");
            points[i][1] = sc.nextInt();
        }
        sc.close();

        findFurthestPoints(points);
        findClosestPoints(points);
    }

    public static int calculateDistance(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }
    
    public static void findFurthestPoints(int[][] points) {
		int maxDistance = -1;
        int[] furthestPoints1 = new int[2];
        int[] furthestPoints2 = new int[2];

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                int distance = calculateDistance(points[i], points[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    furthestPoints1 = points[i];
                    furthestPoints2 = points[j];
                }
            }
        }
        
        System.out.println("Furthest Points:");
        System.out.println("(" + furthestPoints1[0] + ", " + furthestPoints1[1] + ")");
        System.out.println("(" + furthestPoints2[0] + ", " + furthestPoints2[1] + ")");
        System.out.println("Max Distance: " + maxDistance);
	}
    
    public static void findClosestPoints(int[][] points) {
    	int minDistance = Integer.MAX_VALUE;
        int[] closestPoints1 = new int[2];
        int[] closestPoints2 = new int[2];

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                int distance = calculateDistance(points[i], points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    closestPoints1 = points[i];
                    closestPoints2 = points[j];
                }
            }
        }
        
        System.out.println("Closest Points:");
        System.out.println("(" + closestPoints1[0] + ", " + closestPoints1[1] + ")");
        System.out.println("(" + closestPoints2[0] + ", " + closestPoints2[1] + ")");
        System.out.println("Min Distance: " + minDistance);
    }
}
