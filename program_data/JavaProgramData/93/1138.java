package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int x;
	   int a;
	   int b;
	   int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x = Integer.parseInt(tempVar);
	   }
	   a = 0,b = 0,c = 0;
	   if (x % 7 == 0)
	   {
		  a = 7;
	   }
	   if (x % 5 == 0)
	   {
		  b = a;
		  a = 5;
	   }
	   if (x % 3 == 0)
	   {
		  c = b;
		  b = a;
		  a = 3;
	   }
	   if (a == 0)
	   {
		  System.out.print("n");
	   }
	   else
	   {
		  if (b == 0)
		  {
			 System.out.printf("%d",a);
		  }
		  else
		  {
			 if (c == 0)
			 {
				System.out.printf("%d %d",a,b);
			 }
			 else
			 {
				 System.out.printf("%d %d %d",a,b,c);
			 }
		  }
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   x = Integer.parseInt(tempVar2);
	   }
	   return 0;
	}
}

