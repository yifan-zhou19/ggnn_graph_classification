package <missing>;

public class GlobalMembers
{
	public static int dfs(int k, int b)
	{
	  int ret = (k == 1);
	  int i;
	  for (i = b;i <= k;i++)
	  {
		  if (k % i == 0)
		  {
			  ret += dfs(k / i, i);
		  }
	  }
	  return ret;
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{

			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(dfs(k, 2));
			System.out.print("\n");
		}
		return 0;
	}


}

