package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		b = (n - 100 * a) / 10;
		c = n - 100 * a - 10 * b;
		int m;
		m = 100 * c + 10 * b + a;
		System.out.printf("%d\n",m);
	}
}

