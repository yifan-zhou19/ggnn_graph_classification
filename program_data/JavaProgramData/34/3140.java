package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  do
		  {
						 if (a == 1)
						 {
						 break;
						 }
						 if (a % 2 != 0)
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
		  } while (a != 1);
		  if (a == 1)
		  {
		  System.out.print("End");
		  }
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

