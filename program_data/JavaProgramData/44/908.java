package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int;
		int i;
		int n;
		int m;
		for (i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			m = reverse(n);
			System.out.printf("%d\n",m);
		}
	}
	public static int reverse(int x)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int k;
		a = x % 10;
		b = (x - a) / 10 % 10;
		c = (x - a - 10 * b) / 100 % 10;
		d = (x - a - 10 * b - c * 100) / 1000 % 10;
		e = (x - a - 10 * b - 100 * c - 1000 * d) / 10000 % 10;
		k = 10000 * a + 1000 * b + 100 * c + 10 * d + e;
		if (k % 10000 == 0)
		{
			return (k / 10000);
		}
		else if (k % 1000 == 0)
		{
			return (k / 1000);
		}
		else if (k % 100 == 0)
		{
			return (k / 100);
		}
		else if (k % 10 == 0)
		{
			return (k / 10);
		}
		else
		{
			return (k);
		}
	}
}

