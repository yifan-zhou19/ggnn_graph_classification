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
		  if (a == 1)
		  {
				  System.out.print("End\n");
		  }
		  else
		  {
			 while (a != 1)
			 {
				   if (a % 2 == 1)
				   {
				  b = 3 * a + 1;
				  System.out.printf("%d*3+1=%d\n",a,b);
				   }
				  else
				  {
				  b = a / 2;
				  System.out.printf("%d/2=%d\n",a,b);
				  }
			a = b;
			 }
			  System.out.print("End\n");
		  }
		  System.in.read();
		  System.in.read();
	}
}

