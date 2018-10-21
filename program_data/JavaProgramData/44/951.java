package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int[] a = new int[5];
		int i;
		for (i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i <= 5;i++)
		{
		System.out.printf("%d\n",reverse(a[i]));
		}
	}

	public static int reverse(int num)
	{
		int z;
		int a;
		int b;
		int c;
		int d;
		int e;
		a = num / 10000;
		b = (num - 10000 * a) / 1000;
		c = (num - 10000 * a - 1000 * b) / 100;
		d = (num - 10000 * a - 1000 * b - 100 * c) / 10;
		e = num - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if (a != 0)
		{
		z = 10000 * e+1000 * d + 100 * c + 10 * b + a;
		}
		if (a == 0 && b != 0)
		{
			z = 1000 * e+100 * d + 10 * c + b;
		}
		if (a == 0 && b == 0 && c != 0)
		{
			z = 100 * e+10 * d + c;
		}
		if (a == 0 && b == 0 && c == 0 && d != 0)
		{
			z = 10 * e + d;
		}
		if (a == 0 && b == 0 && c == 0 && d == 0)
		{
			z = e;
		}
		return (z);
	}
}

