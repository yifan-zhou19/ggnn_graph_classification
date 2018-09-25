package <missing>;

public class GlobalMembers
{
	public static int[] e = new int[1000];
	public static int[] f = new int[1000];
	public static int Main()
	{
		int n;
		int i;
		int p;
		int w;
		int d;
		int m;
		while (scanf("%d", n) != EOF)
		{
			if (n == 0)
			{
				break;
			}
			m = -n;
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					e + i = tempVar;
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					f + i = tempVar2;
				}
			}
			sort(e, e + n);
			sort(f, f + n);
			for (p = 0;p < n;p++)
			{
				w = d = 0;
				for (i = p;i < n;i++)
				{
					if (e[i] == f[i - p])
					{
						d = 1;
					}
					else if (e[i] > f[i - p])
					{
						w++;
					}
					else
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto cnt;
					}
				}
				if (w - p > m)
				{
					m = w - p;
				}
				if (d == 0)
				{
					break;
				}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	cnt:
	;
			}
			System.out.printf("%d\n", m * 200);
		}
	}

}

