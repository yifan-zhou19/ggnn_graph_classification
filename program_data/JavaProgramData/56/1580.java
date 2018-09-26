package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
		int b;
		int c;
		int d;
		int e;
		int f;
		b = a / 10000;
		c = (a - b * 10000) / 1000;
		d = (a - b * 10000 - c * 1000) / 100;
		e = (a - b * 10000 - c * 1000 - d * 100) / 10;
			f = a - b * 10000 - c * 1000 - d * 100 - e * 10;
		if (!(b == 0))
		{
			System.out.printf("%d%d%d%d%d",f,e,d,c,b);
		}
		else
		{
		   if (!(c == 0))
		   {
			  System.out.printf("%d%d%d%d",f,e,d,c);
		   }
		   else
		   {
			   if (!(d == 0))
			   {
				   System.out.printf("%d%d%d",f,e,d);
			   }
			   else
			   {
				   if (!(e == 0))
				   {
					   System.out.printf("%d%d",f,e);
				   }
				   else
				   {
					   System.out.printf("%d",f);
				   }
			   }
		   }
		}
					   return 0;
	}

}

