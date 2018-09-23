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
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 if (a / 10 == 0)
	 {
	  System.out.printf("%d",a);
	 }
	 else
	 {
	  if (a / 100 == 0)
	  {
	   b = a % 10;
	   c = a / 10;
	   d = 10 * b + c;
		if (b == 0)
		{
		 System.out.printf("0%d",d);
		}
		else
		{
		 System.out.printf("%d",d);
		}
	  }
	  else
	  {
	   if (a / 1000 == 0)
	   {
		b = a % 10;
		c = a / 100;
		d = a / 10 - 10 * c;
		e = 100 * b + 10 * d + c;
		 if (b == 0)
		 {
		  if (d == 0)
		  {
		   System.out.printf("00%d",e);
		  }
		  else
		  {
		   System.out.printf("0%d",e);
		  }
		 }
		 else
		 {
		 System.out.printf("%d",e);
		 }
	   }
	   else
	   {
		if (a / 10000 == 0)
		{
		 b = a % 10;
		 c = a / 1000;
		 d = a / 100 - 10 * c;
		 e = a / 10 - 10 * d - 100 * c;
		 f = 1000 * b + 100 * e+10 * d + c;
		 if (b == 0)
		 {
		  if (e == 0)
		  {
		   if (d == 0)
		   {
			System.out.printf("000%d",f);
		   }
		   else
		   {
			System.out.printf("00%d",f);
		   }
		  }
		  else
		  {
		   System.out.printf("0%d",f);
		  }
		 }
		 else
		 {
		  System.out.printf("%d",f);
		 }
		}
		else
		{
		 System.out.print("00001");
		}
	   }
	  }
	 }
	 return 0;
	}

}

