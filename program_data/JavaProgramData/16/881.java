package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		b = x / 1000 - x / 10000 * 10;
		c = x / 100 - x / 1000 * 10;
		d = x / 10 - x / 100 * 10;
		e = x - x / 10 * 10;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (b != 0)
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
			 else if (c != 0)
			 {
				 System.out.printf("%d%d%d",e,d,c);
			 }
				  else if (d != 0)
				  {
					  System.out.printf("%d%d",e,d);
				  }
					   else
					   {
						   System.out.printf("%d",e);
					   }
		return 0;
	}

}

