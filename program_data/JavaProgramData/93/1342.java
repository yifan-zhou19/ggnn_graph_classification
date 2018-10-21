package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int a;
	 int b;
	 int c;
	 a = 3;
	 b = 5;
	 c = 7;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n % 3 == 0)
	  {
		System.out.printf("%d",a);
		if (n % 5 == 0)
		{
		 System.out.printf(" %d",b);
		 if (n % 7 == 0)
		 {
		  System.out.printf(" %d",c);
		 }
		}
	   else if (n % 7 == 0)
	   {
		 System.out.printf(" %d",c);
	   }
	  }
	  else if (n % 5 == 0)
	  {
		 System.out.printf("%d",b);
		 if (n % 7 == 0)
		 {
		  System.out.printf(" %d",c);
		 }
	  }
	  else if (n % 7 == 0)
	  {
		System.out.printf("%d",c);
	  }
	  else
	  {
	  System.out.print("n\n");
	  }

	   return 0;
	}

}

