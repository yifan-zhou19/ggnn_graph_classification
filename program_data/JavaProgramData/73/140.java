package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] max = new int[5];
		int[] min = new int[5];
		int max1;
		int min1;
		int[] place1 = new int[5];
		int[] place2 = new int[5];
		int leap = 1;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= 4; i++)
		{
			max1 = 0;
			for (j = 0; j <= 4; j++)
			{
				if (a[i][j] > max1)
				{
					max1 = a[i][j];
					place1[i] = j;
				}
			}
			max[i] = max1;
		}
		for (j = 0; j <= 4; j++)
		{
			min1 = max[j];
			place2[j] = j;
			int p = place1[j];
			for (i = 0; i <= 4; i++)
			{
				if (a[i][p] < min1)
				{
					min1 = a[i][p];
					place2[j] = i;
				}
			}
			min[j] = min1;
		}
		for (i = 0; i <= 4; i++)
		{
			if (max[i] == min[i])
			{
				System.out.print(place2[i] + 1);
				System.out.print(" ");
				System.out.print(place1[i] + 1);
				System.out.print(" ");
				System.out.print(max[i]);
				System.out.print("\n");
				leap = 0;
			}
		}
		if (leap == 1)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

