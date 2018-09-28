package <missing>;

public class GlobalMembers
{
	public static int type(int a)
	{
		if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
		{
		return 0;
		}
		else
		{
		return 1;
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
				int[][] m =
				{
					{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
					{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
				};
				int y;
				int m1;
				int m2;
				int sum = 0;
				y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (m1 > m2)
				{
					  for (int k = m2; k < m1; k++)
					  {
							  sum += m[type(y)][k];
					  }
					  if (sum % 7 == 0)
					  {
						  System.out.print("YES");
						  System.out.print("\n");
					  }
					  else
					  {
						  System.out.print("NO");
						  System.out.print("\n");
					  }
				}
				if (m1 < m2)
				{
					  for (int k = m1; k < m2; k++)
					  {
							  sum += m[type(y)][k];
					  }
					  if (sum % 7 == 0)
					  {
						  System.out.print("YES");
						  System.out.print("\n");
					  }
					  else
					  {
						  System.out.print("NO");
						  System.out.print("\n");
					  }
				}
		}
		return 0;
	}
}

