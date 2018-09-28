public class position
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static position[] pos = tangible.Arrays.initializeWithDefaultpositionInstances(10);
	public static int Main()
	{
		int n;
		int[][] finish = new int[10][10];
		int cnt = 0;
		float[][] d = new float[10][10];
		float square = 0F;
		float max = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			pos[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pos[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pos[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				square = (pos[i].x - pos[j].x) * (pos[i].x - pos[j].x) + (pos[i].y - pos[j].y) * (pos[i].y - pos[j].y) + (pos[i].z - pos[j].z) * (pos[i].z - pos[j].z);
				d[i][j] = Math.sqrt(square);
			}
		}
		for (int k = 0; k < n * (n - 1) / 2; k++, max = 0F)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (max < d[i][j] && finish[i][j] == 0)
					{
						max = d[i][j];
					}
				}
			}
			for (int p = 0; p < n; p++)
			{
				for (int q = 0; q < n; q++)
				{
					if (max == d[p][q])
					{
						finish[p][q] = 1;
						cnt++;
						System.out.print("(");
						System.out.print(pos[p].x);
						System.out.print(',');
						System.out.print(pos[p].y);
						System.out.print(',');
						System.out.print(pos[p].z);
						System.out.print(")-(");
						System.out.print(pos[q].x);
						System.out.print(',');
						System.out.print(pos[q].y);
						System.out.print(',');
						System.out.print(pos[q].z);
						System.out.print(")=");
						System.out.printf("%.2f", d[p][q]);
						System.out.printf("%.2f", "\n");
					}
				}
			}
			if (cnt == n * (n - 1) / 2)
			{
				break;
			}
		}
		return 0;
	}


}

