package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int n;
	public static int[][] f = new int[999][999];
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int daodan(int s,int h)
	{
		if (s == n)
		{
			return 0;
		}
		if (h >= a[s])
		{
			return max(daodan(s + 1, a[s]) + 1, daodan(s + 1, h));
		}
		else
		{
			return daodan(s + 1, h);
		}
	}

	public static int Main()
	{
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(daodan(0, 31999));
		return 0;
	}
}

