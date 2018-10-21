package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int m;
	public static int judge(int i,int r)
	{
		if (i == n - 1)
		{
			return r;
		}
		if (r % (n - 1) != 0)
		{
			return 0;
		}
		return judge(i + 1, (r / (n - 1)) * n + k);
	}
	public static int Main()
	{
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (m = 1;judge(0, m * n + k) == 0;m++)
	  {
		  ;
	  }
	  System.out.print(judge(0, m * n + k));
	}
}

