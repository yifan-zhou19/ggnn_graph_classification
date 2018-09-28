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
		  while (a != 1)
		  {
				if (a % 2 == 1)
				{
						   b = a;
						   a = a * 3 + 1;
						   System.out.printf("%d*3+1=%d\n",b,a);
				}
				else
				{
					b = a;
					a = a / 2;
					System.out.printf("%d/2=%d\n",b,a);
				}
		  }
		  System.out.print("End");
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}

