package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100000][2];
		for (i = 0;;i++)
		{
			for (j = 0;j < 2;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[i][0] + a[i][1] == 0)
			{
				break;
			}
		} //??????
		int[] b = new int[100000];
		for (p = 0;p < i;p++)
		{
				for (q = 0;q < n;q++)
				{
					if (a[p][1] == q)
					{
						b[q]++; //??????
					}
				}
		}
		k = 0;
		for (q = 0;q < n;q++)
		{
			if (b[q] == n - 1)
			{
				System.out.print(q);
				System.out.print("\n");
				k = 1;
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

