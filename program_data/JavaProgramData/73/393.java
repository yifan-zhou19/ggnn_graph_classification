package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int i;
		int j;
		int tell;
		int alltell = 0;
		for (i = 0; i < 5; i++)
		{
			max[i] = 0;
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				max[i] = a[i][max[i]] > a[i][j] != 0 ? max[i] : j;
			}
		}
		for (j = 0; j < 5; j++)
		{
			for (tell = 0, i = 0; i < 5; i++)
			{
				if (a[j][max[j]] > a[i][max[j]])
				{
					tell = 1;
				}
			}
			if (tell == 0)
			{
				System.out.print(j + 1);
				System.out.print(" ");
				System.out.print(max[j] + 1);
				System.out.print(" ");
				System.out.print(a[j][max[j]]);
				System.out.print("\n");
				alltell++;
			}
		}
		if (alltell == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

