package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[2000];
	public static int[] b = new int[2000];
	public static int i;
	public static int j;
	public static int k;
	public static int n;
	public static int x;
	public static int y;
	public static int p;
	public static int q;
	public static int ans;

	public static int Main()
	{
		while (scanf("%d",n),n)
		{
			for (i = 0;i < n;++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a,a + n);
			sort(b,b + n);
			x = 0;
			y = n - 1;
			p = 0;
			q = n - 1;
			ans = 0;
			while (x <= y)
			{
				while (x <= y != 0 && a[x]> b[p])
				{
					++ans;
					++x;
					++p;
				}
				while (x <= y != 0 && a[y]> b[q])
				{
					++ans;
					--y;
					--q;
				}
				if (x <= y)
				{
					if (a[x] < b[q])
					{
						--ans;
					}
					++x;
					--q;
				}
			}
			System.out.print(ans * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

