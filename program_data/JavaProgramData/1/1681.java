package <missing>;

public class GlobalMembers
{
	public static int cc; //cc&#190;��&#199;�&#187;12?&#196;�&#214;&#189;a?&#196;�&#189;��&#214;&#214;�y
	public static void fen(int x, int h)
	{
		for (int i = 2;i <= x;i++)
		{
				if ((x % i == 0) && (i >= h) && (i < x))
				{
					fen(x / i, i);
				}
				if ((x % i == 0) && (i >= h) && (i == x))
				{
					cc++;
				}
		}
	}
	public static int Main()
	{
		int n = 0;
		int k = 0;
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (k = 1;k <= n;k++)
		  {
				cc = 0;
				int ff;
				ff = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				fen(ff, 2);
				System.out.print(cc);
				System.out.print("\n");
		  }
		return 0;
	}
}

