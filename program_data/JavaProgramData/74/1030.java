package <missing>;

public class GlobalMembers
{
	public static int f1(int x)
	{
		int n = 0;
		int y;
		y = x;
		while (y > 0)
		{
			n = n * 10 + y % 10;
			y = y / 10;
		}
		if (x == n)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int f2(int x)
	{
		int i = 2;
		while (x % i != 0 && i <= Math.sqrt(x))
		{
			i++;
		}
		if (i > Math.sqrt(x))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int t = 0;
		int[] a = new int[100];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (f1(i) != 0 && f2(i) != 0)
			{
				a[t] = i;
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		else
		{

			for (j = 0;j < t;j++)
			{
				System.out.printf("%d",a[j]);
				if (j < t - 1)
				{
					System.out.print(",");
				}
			}
		}
	}

}

