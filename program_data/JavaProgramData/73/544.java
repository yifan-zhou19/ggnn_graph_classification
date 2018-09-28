package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] min = new int[5];
		int[] maxx = new int[5];
		int[] maxy = new int[5];
		int[] minx = new int[5];
		int[] miny = new int[5];
		int i;
		int j;
		int g = 0;

		for (i = 0; i < 5; i++)
		{
			max[i] = INT_MIN;
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (max[i] < a[i][j])
				{
					max[i] = a[i][j];
					maxx[i] = i;
					maxy[i] = j;
				}
			}
		}
		for (j = 0; j < 5; j++)
		{
			min[j] = INT_MAX;
			for (i = 0; i < 5; i++)
			{
				if (min[j] > a[i][j])
				{
					min[j] = a[i][j];
					minx[j] = i;
					miny[j] = j;
				}
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				if (maxx[i] == minx[j] && maxy[i] == miny[j])
				{
					System.out.print(maxx[i] + 1);
					System.out.print(" ");
					System.out.print(maxy[i] + 1);
					System.out.print(" ");
					System.out.print(a[maxx[i]][maxy[i]]);
					System.out.print("\n");
					g = 1;
				}
			}
		}
		if (g == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
			return 0;
	}
}

