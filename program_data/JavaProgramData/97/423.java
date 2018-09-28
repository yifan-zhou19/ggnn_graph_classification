package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int d1;
		int d2;
		int e1;
		int e2;
		int f1;
		int f2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a1 = n / 100;
		a2 = n % 100;
		b1 = a2 / 50;
		b2 = a2 % 50;
		c1 = b2 / 20;
		c2 = b2 % 20;
		d1 = c2 / 10;
		d2 = c2 % 10;
		e1 = d2 / 10;
		e2 = d2 % 10;
		f1 = e2 / 5;
		f2 = e2 % 5;
		System.out.printf("%d\n",a1);
		System.out.printf("%d\n",b1);
		System.out.printf("%d\n",c1);
		System.out.printf("%d\n",d1);
		System.out.printf("%d\n",f1);
		System.out.printf("%d\n",f2);
		return 0;
	}


}

