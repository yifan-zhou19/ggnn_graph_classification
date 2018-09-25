package <missing>;

public class GlobalMembers
{
	public static final int maxn = 1100;
	public static int[] a = new int[maxn];
	public static int[] b = new int[maxn];
	public static int n;
	public static int count(int d)
	{
		int i;
		int j;
		int win = 0;
		for (i = d;i < n;i++)
		{
			if (a[i] > b[i - d])
			{
				win++;
			}
			else if (a[i] < b[i - d])
			{
				win--;
			}
		}
		return win - d;
	}
	public static int Main()
	{
		int maxwin;
		int i;
		int j;
		int k;
		while (scanf("%d",n),n)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a + i = tempVar;
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b + i = tempVar2;
				}
			}
			sort(a,a + n);
			sort(b,b + n);
			maxwin = -n;
			for (i = 0;i < n;i++)
			{
				k = count(i);
				if (maxwin < k)
				{
					maxwin = k;
				}
			}
			System.out.printf("%d\n",maxwin * 200);
		}
		return 0;
	}
}

