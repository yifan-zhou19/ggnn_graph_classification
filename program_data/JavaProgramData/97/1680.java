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
		a = n / 100;
		b = (n % 100) / 50;
		c = (n % 50) / 20;
			 d = ((n % 50) % 20) / 10;
		e = (n % 10) / 5;
		f = (n % 5) / 1;
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d",f);
		return 0;
	}
}

