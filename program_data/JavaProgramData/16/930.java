package <missing>;

public class GlobalMembers
{
	public static void Main()
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
		a = n % 10;
		System.out.printf("%d",a);
		b = (n - a) / 10;
		if (b != 0)
		{
			b = b % 10;
		   System.out.printf("%d",b);
		   c = (n - 10 * b - a) / 100;
		   if (c != 0)
		   {
			  c = c % 10;
			  System.out.printf("%d",c);
			  d = (n - 100 * c - 10 * b - a) / 1000;
			  if (d != 0)
			  {
				 System.out.printf("%d\n",d);
			  }
		   }
		}
	}

}

