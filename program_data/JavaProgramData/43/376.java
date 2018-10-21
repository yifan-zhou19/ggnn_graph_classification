package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int i;
		int a;
		int j;
		int s;
		int u;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 3;k <= m / 2;k++)
		{
						 s = u = 0;
						 for (i = 2;i <= Math.sqrt(k);i++)
						 {
											if (k % i == 0)
											{
											s = s + 1;
											}
						 }
											if (s == 0)
											{
													a = m - k;
													for (j = 2;j <= Math.sqrt(a);j++)
													{
															 if (a % j == 0)
															 {
															 u = u + 1;
															 }
													}
															 if (u == 0)
															 {
															 System.out.print(k);
															 System.out.print(' ');
															 System.out.print(a);
															 System.out.print("\n");
															 }
											}
		}

															 return 0;
	}



}

