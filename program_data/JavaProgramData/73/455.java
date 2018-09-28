package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int k;
		int l;
		int m;
		int n;
		int flag;
		m = 0;
		n = 0;
		flag = 0;
		for (i = 0; i < 5; i++)
		{
			for (k = 0; k < 5; k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			for (k = 0; k < 4; k++)
			{
				if (a[i][k + 1] > a[i][m])
				{
					m = k + 1;
				}
			}
			for (l = 0; l < 5; l++)
			{
				if (a[l][m] < a[i][m])
				{
					n = 0;
					break;
				}
				else
				{
					n = 1;
				}
			}
			if (n == 1)
			{
				flag = 1;
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(m + 1);
				System.out.print(" ");
				System.out.print(a[i][m]);
				System.out.print("\n");
			}
			m = 0;

		}
		if (flag == 0)
		{
			System.out.print("not");
			System.out.print(" ");
			System.out.print("found");
			System.out.print("\n");
		}
		return 0;
	}
}

