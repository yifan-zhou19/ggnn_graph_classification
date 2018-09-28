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
		  if (a <= 0)
		  {
			  System.out.print("error");
		  }
		  else
		  {
		  while (a != 1)
		  {
					 if (a % 2 == 1)
					 {
								System.out.printf("%d*3+1=%d\n",a,a * 3 + 1);
								a = a * 3 + 1;
					 }
					 else
					 {
						  System.out.printf("%d/2=%d\n",a,a / 2);
					 a = a / 2;
					 }
		  }
		  System.out.print("End");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}

