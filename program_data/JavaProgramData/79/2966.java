package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] flag = new int[400];

	public static int inc(int x)
	{
		if (++x == n + 1)
		{
			x = 1;
		}
		return x;
	}

	public static int Main()
	{

		//freopen("a.txt","r",stdin);

		while (scanf("%d%d",n,m),n != 0 || m != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,0,(Integer.SIZE / Byte.SIZE));
			int cnt = n;
			int now = 0;
			while (cnt > 1)
			{
				for (int i = 0;i < m;i++)
				{
					for (now = inc(now);flag[now] != 0;now = inc(now))
					{
						;
					}
				}
				flag[now] = 1;
				cnt--;

			}
			for (now = inc(now);flag[now] != 0;now = inc(now))
			{
				;
			}
			System.out.printf("%d\n",now);
		}

		return 0;
	}
}
