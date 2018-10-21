package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a,b=0,c;
	 int a;
	 int b = 0;
	 int c;
	 char d;

	 for (scanf("%d", a);(d = System.in.read()) != '\n';)
	 {
	  if (a > b)
	  {
	   c = b;
	   b = a;
	  }
	  else if (a == b)
	  {
	   ;
	  }
	  else if (a >= c)
	  {
	   c = a;
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	 }
	  if (a > b)
	  {
	   c = b;
	   b = a;
	  }
	  else if (a == b)
	  {
	   ;
	  }
	  else if (a >= c)
	  {
	   c = a;
	  }
	 if (c == 0)
	 {
	  System.out.print("No");
	 }
	 else
	 {
		 System.out.printf("%d",c);
	 }
	 return 0;
	}

}

