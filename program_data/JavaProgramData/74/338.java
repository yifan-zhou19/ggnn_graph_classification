package <missing>;

public class GlobalMembers
{
	public static int zh(int x)
	{
		int i = 0;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i > Math.sqrt(x))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int h(int x)
	{
		int m = 0;
		int n = x;
		while (n > 0)
		{
			m = m * 10 + n % 10;
			n /= 10;
		}
		if (x == m)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int d = 0;
		int[] a = new int[1000];
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
		for (i = m;i <= n;i++)
		{
			if (h(i) != 0 && zh(i) != 0)
			{
				a[d] = i;
				d++;
			}
		}
		if (d == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < d - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d\n",a[d - 1]);
		}
	}

}

