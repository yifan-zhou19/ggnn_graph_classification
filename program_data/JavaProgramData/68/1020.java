package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100000];
	public static int f(int y)
	{
		int t;
		int i;
		t = Math.sqrt(y);
		for (i = 2;i <= t;i++)
		{
				if (y % i == 0)
				{
					break;
				}
		}
		if (i > t)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main(String[] args)
	{
		int n;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int x = 0;
		for (j = 2;j <= n;j++)
		{
			k = Math.sqrt(j);
			for (z = 2;z <= k;z++)
			{
				if (j % z == 0)
				{
					break;
				}
			}
			if (z > k)
			{
				a[x] = j;
				x++;
			}
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 0;j <= x;j++)
			{
				if (f(i - a[j]) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,a[j],i - a[j]);
					break;
				}
			}
			continue;

		}
	}
}

