package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int su = int x;
		int hui = int x;
		int m;
		int n;
		int i = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (x = m;x <= n;x++)
		{
			if (su(x) != 0 && hui(x) != 0)
			{
				if (i != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",x);
				i++;
			}
		}
			if (i == 0)
			{
				System.out.print("no");
			}
	}
	public static int su(int x)
	{
		int i;
		int c = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				c = 0;
				break;
			}
		}
			if (c != 0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}
	public static int hui(int x)
	{
		int[] a = new int[100];
		int t;
		int i;
		int k;
		int c = 1;
		t = Math.log10(x);
		k = t;
		for (i = 0;i <= t;i++)
		{
			a[i] = x / Math.pow(10,k);
			x -= a[i] * Math.pow(10,k);
			k--;
		}
		for (i = 0;i <= t;i++)
		{
			if (a[i] != a[t - i])
			{
				c = 0;
				break;
			}
		}
					if (c != 0)
					{
						return 1;
					}
			else
			{
				return 0;
			}
	}
}

