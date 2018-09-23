package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int f;
	   int g;
	   int h;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   b = Math.floor(a / 10000);
	   a = a - b * 10000;
	   c = Math.floor(a / 1000);
	   a = a - c * 1000;
	   d = Math.floor(a / 100);
	   a = a - d * 100;
	   e = Math.floor(a / 10);
	   a = a - e * 10;
	   if (b == 0)
	   {
			 if (c == 0)
			 {
			   if (d == 0)
			   {
				 if (e == 0)
				 {
			   System.out.printf("%d",a);
				 }
			 else
			 {
				 System.out.printf("%d%d",a,e);
			 }
			   }
		   else
		   {
			   System.out.printf("%d%d%d",a,e,d);
		   }
			 }
		 else
		 {
			 System.out.printf("%d%d%d%d",a,e,d,c);
		 }
	   }
	   else
	   {
		   System.out.printf("%d%d%d%d%d",a,e,d,c,b);
	   }


	}

}

