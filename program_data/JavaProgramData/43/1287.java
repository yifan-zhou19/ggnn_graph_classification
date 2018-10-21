package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int y = 2;
		int z = 0;
		while (y <= Math.sqrt(x))
		{
			z = z + !(x - (x / y) * y);
			y = y + 1;
		}
		return (z);
	}
	public static int Main()
	{
		int a;
		int b;
		int n;
		a = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (a <= (n / 2))
		{
			b = n - a;
			if ((f(a) * f(a) + f(b) * f(b)) == 0)
			{
			System.out.printf("%d %d\n",a,b);
			}
			a++;
		}
	}
}

