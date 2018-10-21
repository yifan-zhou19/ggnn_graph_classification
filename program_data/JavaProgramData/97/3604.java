package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		b = (n % 100 - n % 10) / 10;
		c = n / 100;
		System.out.printf("%d\n",c);
		if (b < 5)
		{
			System.out.printf("%d\n%d\n%d\n",0,b / 2,b - b / 2 * 2);
		}
		else
		{
			System.out.printf("%d\n%d\n%d\n",1,(b - 5) / 2,b - (b - 5) / 2 * 2 - 5);
		}
		if (a < 5)
		{
			System.out.printf("%d\n%d\n",0,a);
		}
		else
		{
			System.out.printf("%d\n%d\n",1,a - 5);
		}
		return 0;
	}
}

