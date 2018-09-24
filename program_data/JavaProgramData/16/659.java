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
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	if (a == 0)
	{
		System.out.print("0");
	}
	else
	{
	b = a / 1000;
	 c = (a % 1000) / 100;
	 d = (a % 100) / 10;
	 e = a % 10;
	 a = b + 10 * c + 100 * d + 1000 * e;
	 if ((a % 10) == 0)
	 {
	   a = a / 10;
	   if ((a % 10) == 0)
	   {
		 a = a / 10;
		  if ((a % 10) == 0)
		  {
			  a = a / 10;
		  }
	   }
	 }
	if (e == 0)
	{
	   System.out.printf("%d",e);
	   if (d == 0)
	   {
		  System.out.printf("%d",d);
		  if (c == 0)
		  {
		 System.out.printf("%d",c);
		  }
	   }
	}
	 System.out.printf("%d",a);
	}
	 return 0;
	}

}

