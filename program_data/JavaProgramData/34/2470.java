package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  for (;a > 1;)
		  {
				  if (a % 2 == 0)
				  {
							a = a / 2;
							b = a * 2;
							System.out.printf("%d/2=%d\n",b,a);
				  }
				  else
				  {
					  a = a * 3 + 1;
					  c = (a - 1) / 3;
					  System.out.printf("%d*3+1=%d\n",c,a);
				  }
		  }
		  System.out.print("End");
		  System.in.read();
		  System.in.read();
	}



}

