package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int t;
		int[] m = new int[5];
		int[] n = new int[5];
		int p;
		int flag = 0;
		for (i = 0; i < 5; i++)
		{
			for (t = 0; t < 5; t++)
			{
				a[i][t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (t = 0;t < 5;t++)
			{
				if (m[i] < a[i][t])
				{
					m[i] = a[i][t];
					n[i] = t;
				}
			}
		}
		for (p = 0;p < 5;p++)
		{
			for (i = 0;i < 5;i++)
			{
				if (m[p] > a[i][n[p]])
				{
					flag++;
					break;
				}
			}
			if (i == 5)
			{
				System.out.print(p + 1);
				System.out.print(" ");
				System.out.print(n[p] + 1);
				System.out.print(" ");
				System.out.print(m[p]);
				System.out.print("\n");
			}
		}
		if (flag == 5)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

