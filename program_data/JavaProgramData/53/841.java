package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int[] dp = new int[100000];
		int f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (dp[a] == 0)
			{
			  if (f == 0)
			  {
			  System.out.print(a);
			  f++;
			  }
			  else
			  {
				  System.out.print(",");
				  System.out.print(a);
			  }
			}
			dp[a] = 1;
		}
	}

}

