package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		int sum;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		int f = int x;
		for (i = 0;i < 6;i++)
		{
			sum = f(a[i]);
			System.out.printf("%d\n",sum);
		}
	}
	public static int f(int x)
	{
		int sum;
		int g = int y;
		if (x > 0)
		{
			sum = g(x);
		}
		if (x == 0)
		{
			sum = 0;
		}
		if (x < 0)
		{
			sum = -g(-x);
		}
		return (sum);
	}
	public static int g(int y)
	{
		int[] a = new int[5];
		int sum = 0;
		int i;
		int n;
		for (i = 0;i < 5;i++)
		{
			a[i] = y % 10;
			y = y / 10;
		}
		for (i = 4;i >= 0;i--)
		{
			if (a[i] == 0)
			{
				continue;
			}
			else
			{
				n = i;
				break;
			}
		}
		for (i = 0;i <= n;i++)
		{
			sum = sum * 10 + a[i];
		}
		return (sum);
	}
}

