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
	 if (x <= 0 || x>99999)
	 {
	  System.out.print("????!\n");
	 }

	 else
	 {
	  if (x >= 10000)
	  {
		a = (int)(x / 10000);
		b = (int)((x - a * 10000) / 1000);
		c = (int)((x - a * 10000 - b * 1000) / 100);
		d = (int)((x - a * 10000 - b * 1000 - c * 100) / 10);
		e = x - a * 10000 - b * 1000 - c * 100 - d * 10;
	  System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
	  }
		else
		{
		 if (x >= 1000)
		 {
		  a = (int)(x / 1000);
	   b = (int)((x - a * 1000) / 100);
	   c = (int)((x - a * 1000 - b * 100) / 10);
	   d = x - a * 1000 - b * 100 - c * 10;
			 System.out.printf("%d%d%d%d\n",d,c,b,a);
		 }
	   else
	   {
		  if (x >= 100)
		  {
			 a = (int)(x / 100);
					 b = (int)((x - a * 100) / 10);
		 c = x - a * 100 - b * 10;
				 System.out.printf("%d%d%d\n",c,b,a);
		  }
		else
		{
		  if (x >= 10)
		  {
		   a = (int)(x / 10);
		   b = x - a * 10;
		   System.out.printf("%d%d\n",b,a);
		  }
		  else
		  {
		  if (x > 0)
		  {
			   a = x;
		   System.out.printf("%d\n",a);
		  }
		  }
		}
	   }
		}
	 }
		 return 0;
	}


}

