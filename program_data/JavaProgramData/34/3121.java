package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x;
		  int a;
		  int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x = Integer.parseInt(tempVar);
		  }

		  while (x != 1)
		  {
			 if (x % 2 == 0)
			 {
			 System.out.printf("%d/2=%d\n",x,x / 2);
			 x = x / 2;
			 }
			 else
			 {
				 System.out.printf("%d*3+1=%d\n",x,x * 3 + 1);
			 x = x * 3 + 1;
			 }

		  }
		  if (x == 1)
		  {
			  System.out.print("End");
		  }




		  System.in.read();
		  System.in.read();
	}

}

