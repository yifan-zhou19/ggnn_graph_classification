package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int[] max = new int[6];
		int[] mp = new int[6];
		int s = 0;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if (j == 1)
				{
					max[i] = a[i][j];
					mp[i] = j;
				}
				else if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					mp[i] = j;
				}
			}
		}
		for (int i = 1; i <= 5; i++)
		{
			if (max[i] <= a[1][mp[i]] != 0 && max[i] <= a[2][mp[i]] != 0 && max[i] <= a[3][mp[i]] != 0 && max[i] <= a[4][mp[i]] != 0 && max[i] <= a[5][mp[i]])
			{
				s += 1;
				System.out.print(i);
				System.out.print(" ");
				System.out.print(mp[i]);
				System.out.print(" ");
				System.out.print(max[i]);
				System.out.print("\n");
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

