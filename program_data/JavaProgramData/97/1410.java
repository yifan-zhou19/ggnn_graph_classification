package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		n = n % 100;
		b = n / 50;
		n = n % 50;
		c = n / 20;
		n = n % 20;
		d = n / 10;
		n = n % 10;
		e = n / 5;
		f = n % 5;


		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		 System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		 System.out.printf("%d\n",f);



	return 0;


	}
}

