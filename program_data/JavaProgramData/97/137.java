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
		if (n >= 1000 || n < 1)
		{
			System.out.print("error\n");
		}
		else
		{
			a = n / 100;
			n = n % 100;
			b = n / 50;
			n = n % 50;
			c = n / 20;
			n = n % 20;
			d = n / 10;
			n = n % 10;
			e = n / 5;
			n = n % 5;
			f = n;

		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		 System.out.printf("%d\n",d);
		 System.out.printf("%d\n",e);
		 System.out.printf("%d",f);
		}
		return 0;
	}

}

