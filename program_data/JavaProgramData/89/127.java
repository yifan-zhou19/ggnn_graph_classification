package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[10000];
	public static void read()
	{
		int i;
		int j;
		for (scanf("%d%d%d", n, i, j); i + j != 0;scanf("%d%d", i, j))
		{
			a[j]++;
		}
	}


	public static int Main()
	{
		int i;
		read();
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}
}
