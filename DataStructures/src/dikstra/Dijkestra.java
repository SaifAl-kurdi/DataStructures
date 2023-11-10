package dikstra;

public class Dijkestra {

	private static final int NO_PARENT = -1;
	
	
	void dijkstra(int[][] adjacencyMatrix, int stVertex) {
		int nearVertex = adjacencyMatrix[0].length;

		int[] shDistances = new int[nearVertex];

			// visited vertices
		boolean[] added = new boolean[nearVertex];

		for (int vertexIndex = 0; vertexIndex < nearVertex; vertexIndex++) {
				//Infimity
			shDistances[vertexIndex] = Integer.MAX_VALUE;
			added[vertexIndex] = false;
		}

		shDistances[stVertex] = 0;

		int[] parent = new int[nearVertex];

		parent[stVertex] = NO_PARENT;

		for (int i = 1; i < nearVertex; i++) {

			int nrstVertex = -1;
			int shorDistance = Integer.MAX_VALUE;
			for (int verIndex = 0; verIndex < nearVertex; verIndex++) {
				if (!added[verIndex] && shDistances[verIndex] < shorDistance) {
					nrstVertex = verIndex;
					shorDistance = shDistances[verIndex];
				}
			}

			added[nrstVertex] = true;

			for (int verIndex = 0; verIndex < nearVertex; verIndex++) {
				int edgesDistance = adjacencyMatrix[nrstVertex][verIndex];

				if (edgesDistance > 0 && ((shorDistance + edgesDistance) < shDistances[verIndex])) {
					parent[verIndex] = nrstVertex;
					shDistances[verIndex] = shorDistance + edgesDistance;
				}
			}
		}

		print(stVertex, shDistances, parent);
	}

	void print(int startVertex, int[] distances, int[] parents) {
		int nearVertices = distances.length;
		System.out.print("Vertex\t Distance\t Path");

		for (int vertIndex = 0; vertIndex < nearVertices; vertIndex++) {
			if (vertIndex != startVertex) {
				System.out.print("\n" + startVertex + " -> ");
				System.out.print(vertIndex + " \t\t ");
				System.out.print(distances[vertIndex] + "\t\t");
				printPath(vertIndex, parents);
			}
		}
	}

	void printPath(int currVertex, int[] parents) {

		if (currVertex == NO_PARENT) {
			return;
		}
		printPath(parents[currVertex], parents);
		System.out.print(currVertex + " " + " ");
	}
}