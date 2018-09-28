package <missing>;

public class GlobalMembers
{
	public static int[] tj = new int[1000];
	public static int[] qw = new int[1000];

	public static int Main()
	{
		//freopen("data.txt","r",stdin);
		int n;
		int i;
		int j;
		int w;
		int win;
		int c;
		int m;
		while (scanf("%d", n) && n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tj + i = tempVar;
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qw + i = tempVar2;
				}
			}
			sort(tj,tj + n);
			sort(qw,qw + n);
			m = -n;
			for (i = 0;i < n;i++)
			{
				c = -i;
				for (j = i, w = 0;j < n && tj[j] >= qw[w];j++, w++)
				{
					if (tj[j] > qw[w])
					{
						c++;
					}
				}
				if (j == n && c > m)
				{
					m = c;
				}
			}
			System.out.printf("%d\n",m * 200);
		}
		return 0;
	}

}

