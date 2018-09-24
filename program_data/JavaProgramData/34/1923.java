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
		  while (a >= 2)
		  {
						 if (a % 2 == 1)
						 {
							 b = 3 * a + 1;
						 System.out.printf("%d*3+1=%d\n",a,b);
						 c = b;
						 a = c;
						 a = b;
						 continue;
						 }
						 else
						 {
							 b = a / 2;
						 System.out.printf("%d/2=%d\n",a,b);
						 c = b;
						 a = c;
						 a = b;
						 continue;
						 }
		  }

						 System.out.print("End\n");

	}

}

