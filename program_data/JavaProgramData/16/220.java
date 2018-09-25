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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 1000;
		b = (n / 100) % 10;
		c = (n % 100) / 10;
		d = n % 10;



		if (n / 1000 != 0)
		{
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else if (n / 100 != 0)
		{
			System.out.printf("%d%d%d",d,c,b);
		}
		else if (n / 10 != 0)
		{
			System.out.printf("%d%d",d,c);
		}
		else
		{
			System.out.printf("%d",d);
		}


	return 0;

	}
}

