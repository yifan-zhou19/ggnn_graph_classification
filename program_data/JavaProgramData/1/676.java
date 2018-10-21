package <missing>;

public class GlobalMembers
{
	public static int varieties = 0;
	public static int p;
	public static int dfs(int dep,int last,int k) //???????????k????? ??
	{
		if (k == 1) //??k=1
		{
			varieties++; //???+1
			return 0;
		}
		for (int i = last; i <= k; i++)
		{
		if (k % i == 0) //??k??i????????????k=1
		{
			dfs(dep + 1, i, k / i);
		}
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = new int[n]; //????n????????
		for (i = 0;i < n;i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dfs(0, 2, t);
			m[i] = varieties;
			varieties = 0;
		}
		for (i = 0;i < n;i++)
		{
		System.out.print(m[i]);
		System.out.print("\n");
		}
		return 0;
	}
}

