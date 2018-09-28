package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int s = 0;
	public static void put(int p,int j,int m)
	{
		if ((p == n) && (m == 0))
		{
			s++;
		}
	 else if (p != n)
	 {
	  for (int i = j;i <= m;i++)
	  {
		  if (m - i >= 0)
		  {
			  put(p + 1, i, m - i);
		  }
	  }
	 }

	}
	public static int Main()
	{
		int t;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= t;i++)
	{
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  s = 0;
	  if (n > m)
	  {
		  n = m;
	  }
	  for (int j = 0;j <= m;j++)
	  {
		  put(1, j, m - j);
	  }
	  System.out.print(s);
	  System.out.print("\n");
	}
	return 0;
	}

}

