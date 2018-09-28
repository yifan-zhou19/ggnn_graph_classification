package <missing>;

public class GlobalMembers
{
	public static int oddoreven(int a)
	{
		if (a % 2 == 0)
		{
		  return (1);
		}
		else
		{
		  return (0);
		}
	}
	public static int Main()
	{
		  int a;
		  int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  for (a;;)
		  {
			   if (oddoreven(a) == 1)
			   {
				   b = a / 2;
				   if (b == 1)
				   {
					   System.out.print("2/2=1\n");
					  System.out.print("End");
					  break;
				   }
				   else
				   {
					   System.out.printf("%d/2=%d\n",a,b);
					  a = b;
				   }
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
					 b = 3 * a + 1;
					System.out.printf("%d*3+1=%d\n",a,b);
					a = b;
				 }
			   }

		  }

	}

}

