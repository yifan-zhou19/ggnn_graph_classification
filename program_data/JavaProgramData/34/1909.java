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
		  if (a == 1)
		  {
		  System.out.print("End");
		  }
		  else


		  {
			  for (;;)
			  {
			 if (a % 2 == 0)
			 {
				   System.out.printf("%d/2=%d\n",a,a / 2);
		 a = a / 2;
			 }
		 else
		 {
		 if (a == 1)
		 {
				  System.out.print("End");
				  break;
		 }
		 else
		 {
			  System.out.printf("%d*3+1=%d\n",a,3 * a + 1);
		 a = 3 * a + 1;
		 }
		 }
			  }

		  }



	}

}

