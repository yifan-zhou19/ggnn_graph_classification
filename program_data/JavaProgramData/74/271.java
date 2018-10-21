package <missing>;

public class GlobalMembers
{
	public static int dudu(int x)
	{
		int i;
		int j;
		j = Math.sqrt(x);
		(int) j;
		for (i = 3;i <= (j + 1);i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == (j + 2))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int jay(int x)
	{
		int a;
		int i = 0;
		int j;
		int n;
		int[] b = new int[1000];
		for (a = 10;(x * 10 - a) >= 0;a = (a * 10))
		{
			b[i] = x % a;
			x = (x - b[i]);
			b[i] = b[i] * 10 / a;
			i++;
		}
		i--;
		if (i % 2 != 0)
		{
			n = (i - 1) / 2;
		}
		else
		{
			n = i / 2;
		}
		for (j = 0;j <= n;j++)
		{
			if (b[i - j] != b[j])
			{
				break;
			}
		}
		if (j == (n + 1))
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
		int i = 0;
		int j;
		int p;
		int[] a = new int[300];
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
		if (m % 2 == 0)
		{
			m++;
		}
		if (n % 2 == 0)
		{
			n--;
		}
		for (p = m;p <= n;p = p + 2)
		{
			if (jay(p) != 0)
			{
				if (dudu(p) != 0)
				{
					a[i] = p;
					i++;
				}
			}
		}
		if (i == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (j = 0;j < i;j++)
			{
			if (j == i - 1)
			{
				System.out.printf("%d",a[j]);
			}
		else
		{
			System.out.printf("%d,",a[j]);
		}
			}
		}
	}
}

