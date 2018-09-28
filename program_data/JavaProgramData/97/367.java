package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n",n / 100);
		a = n % 100;
		System.out.printf("%d\n",a / 50);
		b = a % 50;
		System.out.printf("%d\n",b / 20);
		c = b % 20;
		System.out.printf("%d\n",c / 10);
		d = c % 10;
		System.out.printf("%d\n",d / 5);
		e = d % 5;
		System.out.printf("%d\n",e / 1);
		return 0;
	}

}

