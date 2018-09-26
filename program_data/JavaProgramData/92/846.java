package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[1002];
	public static int[] b = new int[1002];
	public static int solve(int start)
	{
		int i;
		int sum = 0;
		for (i = start;i < n;i++)
		{
			if (b[i] > a[i - start])
			{
				sum += 200;
			}
			else if (b[i] < a[i - start])
			{
				sum -= 200;
			}
			else
			{
				;
			}
		}
		for (i = 0;i < start;i++)
		{
			if (b[i] > a[n - start + i])
			{
				sum += 200;
			}
			else if (b[i] < a[n - start + i])
			{
				sum -= 200;
			}
			else
			{
				;
			}
		}
		return sum;
	}
	public static int Main()
	{
		int i;
		while (scanf("%d",n) && n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b + i = tempVar;
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a + i = tempVar2;
				}
			}
			sort(a,a + n);
			sort(b,b + n);
			int maxp = -99999999;
			for (i = 0;i < n;i++)
			{
				int temp = solve(i);
				if (maxp < temp)
				{
					maxp = temp;
				}
			}
			System.out.printf("%d\n",maxp);
		}
		return 0;
	}
}

