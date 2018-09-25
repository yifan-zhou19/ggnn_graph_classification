package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int i;
	public static int j;
	public static int[] an = new int[30];
	public static int DFS(int h, int n)
	{
		int t1;
		int t2;
		if (n == k - 1)
		{
			if (an[n] > h)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		if (an[n] > h)
		{
			return DFS(h, n + 1);
		}
		else
		{
			t1 = DFS(h, n + 1);
			t2 = DFS(an[n], n + 1) + 1;
			if (t1 > t2)
			{
				return t1;
			}
			else
			{
				return t2;
			}
		}
	}
	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < k ;i++)
		{
			an[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(DFS(INT_MAX, 0));
		System.out.print("\n");
		return 0;
	}
}

