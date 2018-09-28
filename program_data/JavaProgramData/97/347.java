package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
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
		if (n >= 100)
		{
			a = n / 100;
			n = n % 100;
		}
		if (n >= 50)
		{
			b = n / 50;
			n = n % 50;
		}
		if (n >= 20)
		{
			c = n / 20;
			n = n % 20;
		}
		if (n >= 10)
		{
			d = n / 10;
			n = n % 10;
		}
		if (n >= 5)
		{
			e = n / 5;
			n = n % 5;
		}
			 if (n < 5 && n>0)
			 {
				 f = n;
			 }
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a, b, c, d, e, f);
	}


}

