package <missing>;

public class GlobalMembers
{
	public static final int maxn = 1000;

	public static int n;
	public static int[] a = new int[maxn + 10];
	public static int[] b = new int[maxn + 10];

	public static int[] mark = new int[maxn + 10];

	public static void Sort(int[] a)
	{
		int i;
		int j;
		int k;
		for (i = 1;i < n;i++)
		{
		for (j = i + 1;j <= n;j++)
		{
			if (a[j] < a[i])
			{
			k = a[j];
			a[j] = a[i];
			a[i] = k;
			}
		}
		}
	}

	public static int Main()
	{
		int i;
		int ans;
		int s1;
		int t1;
		int s2;
		int t2;
		for (scanf("%ld",n);n > 0;scanf("%ld",n))
		{
			for (i = 1;i <= n;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a + i = tempVar;
			}
			}
			for (i = 1;i <= n;i++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b + i = tempVar2;
			}
			}
			Sort(a);
			Sort(b);
			s1 = 1;
			t1 = n;
			s2 = 1;
			t2 = n;
			ans = 0;
			while (t1 >= s1)
			{
				while ((a[s1] > b[s2]) && (s1 <= t1))
				{
					ans += 200;
					s1++;
					s2++;
				}
				while ((a[t1] > b[t2]) && (s1 <= t1))
				{
					ans += 200;
					t1--;
					t2--;
				}
				if (t1 >= s1)
				{
					if (a[s1] < b[t2])
					{
						ans -= 200;
					}
					s1++;
					t2--;
				}
			}
			System.out.printf("%ld\n",ans);
		}
		return 0;
	}


}

