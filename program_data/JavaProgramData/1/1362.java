package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int fjys(int n, int m, int i, int d, int[] ji)
	{
		int a;
		for (a = i;a < m;a++)
		{
			if (n % a == 0)
			{
				ji[d] = a;
				int chenji = 1;
				int k;
				for (k = 0;k <= d;k++)
				{
					chenji = chenji * ji[k];
				}
				if (chenji == m)
				{
					num++;
					break;
				}
				else
				{
					fjys(n / a, m, a, d + 1, ji);
				}
			}
		}
		return num;
	}
	public static int Main()
	{
		int m;
		int n;
		int j;
		int result = 0;
		int[] ji = new int[20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= m;j++)
		{
			num = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			result = fjys(n, n, 2, 0, ji);
			System.out.print(result + 1);
			System.out.print("\n");
		}
			return 0;
	}


}

