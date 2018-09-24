package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int d = 2;
		  int e = 3;
		  int f = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  while (a > 1)
		  {
			 if (a % 2 == 0)
			 {
					   b = a / 2;
					   System.out.printf("%d/%d=%d\n",a,d,b);
					   a = b;
			 }
			 else
			 {
				 c = 3 * a + 1;
				 System.out.printf("%d*%d+%d=%d\n",a,e,f,c);
				 a = c;
			 }
		  }
				 System.out.print("End\n");
	}
}

