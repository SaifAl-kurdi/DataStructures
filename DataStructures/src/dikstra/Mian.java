package dikstra;

public class Mian {

	public static void main(String[] args) {
		Dijkestra di = new Dijkestra();

		int a[] = { 0, 2, 1, 0, 0 };
		int b[] = { 2, 0, 8, 4, 1 };
		int c[] = { 1, 8, 0, 3, 0 };
		int d[] = { 0, 4, 3, 0, 9 };
		int e[] = { 0, 1, 0, 9, 0 };
		

		int[][] adjacencyMatrix = { a, b, c, d, e };
		
		

		di.dijkstra(adjacencyMatrix, 0); 
	}
}