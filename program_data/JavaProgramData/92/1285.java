package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[MAX];
	public static int[] b = new int[MAX];
	public static int i;
	public static int j;
	public static int k;
	public static int ans;


	public static int Main()
	{



		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a + i = tempVar2;
				}
			}
			for (i = 0;i < n;++i)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b + i = tempVar3;
				}
			}
			sort(a,a + n);
			sort(b,b + n);
			ans = -200 * n;
			for (j = 0;j < n;++j)
			{
				k = 0;
				for (i = 0;i < n;++i)
				{
					if (a[i] > b[(i + j) % n])
					{
						k += 200;
					}
					if (a[i] < b[(i + j) % n])
					{
						k -= 200;
					}
				}
				if (k > ans)
				{
					ans = k;
				}
			}
			System.out.printf("%d\n",ans);
		}

		return 0;
	}

}

