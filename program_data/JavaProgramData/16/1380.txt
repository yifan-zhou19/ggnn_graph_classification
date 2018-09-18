package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = 0;
		a = n;
		if (n == 0)
		{
			System.out.print("0");
		}
		else
		{
		while (a > 0)
		{
		  a = (int)(a / 10);
		  b = b + 1;
		}
		}
		c = n % 10;
		d = (int)(n / 10) % 10;
		e = (int)(n / 100) % 10;
		f = (int)(n / 1000) % 10;
		g = (int)(n / 10000);
		switch (b)
		{
			case 1:
				System.out.printf("%d\n",n);
				break;
			case 2:
				System.out.printf("%d%d\n",c,d);
			 break;
		 case 3:
				System.out.printf("%d%d%d\n",c,d,e);
				break;
		 case 4:
			   System.out.printf("%d%d%d%d\n",c,d,e,f);
				break;
		   case 5:
			   System.out.printf("%d%d%d%d%d\n",c,d,e,f,g);
				break;
		}
		return 0;
	}

}

