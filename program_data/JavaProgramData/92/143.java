package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[2000];
	public static int[] b = new int[2000];
	public static int[] t = new int[2000];
	public static int[] s = new int[2000];
	public static int n;
	public static void init()
	{
		int i;
		int k;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		sort(a,a + n);
		sort(b,b + n);
	}
	public static void work()
	{
		int i;
		int k = 0;
		int j;
		int ans = 0;
		int x;
		int y;
		for (i = 0;i < n;i++)
		{
			x = -1;
			for (j = 0;j < n;j++)
			{
				if (a[i] > b[j] && b[j] > x && s[j] == 0)
				{
					y = j;
					x = b[j];
				}
			}
			if (x != -1)
			{
				s[y] = 1;
				t[i] = 1;
				ans += 200;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == 0)
			{
			x = -1;
			for (j = 0;j < n;j++)
			{
				if (a[i] == b[j] && s[j] == 0)
				{
				x = j;
				}
			}
			if (x != -1)
			{
				s[x] = 1;
			}
			else
			{
				ans -= 200;
			}
			}
		}

		System.out.printf("%d\n",ans);
	}
	public static int Main()
	{
		while (scanf("%d",n) && n != 0)
		{
			init();
			work();
		}
	}
}

