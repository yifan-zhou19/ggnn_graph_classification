package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 loop:
		 if (a == 1)
		 {
		 System.out.print("End");
		 System.in.read();
		 System.in.read();
		 return 0;
		 }
		 else if (a % 2 != 0)
		 {
		   {
					 b = a * 3 + 1;
	   }
		   System.out.printf("%d*3+1=%d\n",a,b);
		   a = b;
		 }
		  else if (a % 2 == 0)
		  {
		   {
			   b = a / 2;
	   }
		   System.out.printf("%d/2=%d\n",a,b);
		   a = b;
		  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto loop;
	}
}

