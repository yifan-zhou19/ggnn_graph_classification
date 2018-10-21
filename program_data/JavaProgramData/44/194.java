package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int i;
		  for (i = 1;i <= 6;i++)
		  {
		  int a;
		  int x;
		  int y;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  if (a < 0)
		  {
				 a = -a;
				 for (y = 0;a > 0;a = a / 10)
				 {
									x = a % 10;
									y = 10 * y + x;
				 }
				 y = -y;
				 System.out.printf("%d\n",y);
		  }
		  else
		  {
			  for (y = 0;a > 0;a = a / 10)
			  {
									x = a % 10;
									y = 10 * y + x;
			  }
				 System.out.printf("%d\n",y);
		  }
		  }
	  }

}

