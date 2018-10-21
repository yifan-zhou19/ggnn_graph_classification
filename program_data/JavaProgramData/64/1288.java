package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] point = new int[10][3]; // to store the position of the points
		float[][] distance = new float[45][3]; // to store the distances
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				point[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int count = 0; // to calculate the number of the distances
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i + 1; j < n; j++)
			{ // to calculate the distances and store the name of the points
				distance[count][0] = i;
				distance[count][1] = j;
				distance[count][2] = Math.sqrt((float)(point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]));
				count++;
			}
		}
		float temp = 0F;
		for (int i = 0; i < count - 1; i++) // bubble sort
		{
			for (int j = i + 1; j < count ; j++)
			{
				if (distance[i][2] < distance[j][2])
				{
					temp = distance[i][0];
					distance[i][0] = distance[j][0];
					distance[j][0] = temp;
					temp = distance[i][1];
					distance[i][1] = distance[j][1];
					distance[j][1] = temp;
					temp = distance[i][2];
					distance[i][2] = distance[j][2];
					distance[j][2] = temp;
				}
				else if (distance[i][2] == distance[j][2])
				{
					if (distance[i][0] > distance[j][0])
					{
						temp = distance[i][0];
						distance[i][0] = distance[j][0];
						distance[j][0] = temp;
						temp = distance[i][1];
						distance[i][1] = distance[j][1];
						distance[j][1] = temp;
						temp = distance[i][2];
						distance[i][2] = distance[j][2];
						distance[j][2] = temp;
					}
					if (distance[i][1] > distance[j][1])
					{
						temp = distance[i][0];
						distance[i][0] = distance[j][0];
						distance[j][0] = temp;
						temp = distance[i][1];
						distance[i][1] = distance[j][1];
						distance[j][1] = temp;
						temp = distance[i][2];
						distance[i][2] = distance[j][2];
						distance[j][2] = temp;
					}
				}
			}
		}
		for (int i = 0; i < count; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", point[(int)distance[i][0]][0],point[(int)distance[i][0]][1],point[(int)distance[i][0]][2],point[(int)distance[i][1]][0],point[(int)distance[i][1]][1],point[(int)distance[i][1]][2],distance[i][2]);

		}

		return 0;
	}
}

