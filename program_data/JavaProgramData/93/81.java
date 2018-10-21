package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int is3;
		  int is5;
		  int is7;
		  int is;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  is3 = (n % 3 == 0);
		  is5 = (n % 5 == 0);
		  is7 = (n % 7 == 0);

		  is = is3 + is5 + is7;
		  switch (is)
		  {
					case 0:
					{
							   System.out.print("n");
							   break;
					}
					case 3:
					{
							   System.out.print("3 5 7");
							   break;
					}
					case 2:
					{
							   if (is3 != 0 && is5 != 0)
							   {
								   System.out.print("3 5");
							   }
							   if (is5 != 0 && is7 != 0)
							   {
								   System.out.print("5 7");
							   }
							   if (is7 != 0 && is3 != 0)
							   {
								   System.out.print("3 7");
							   }
							   break;
					}
					case 1:
					{
							   if (is3 != 0)
							   {
								   System.out.print("3");
							   }
							   if (is5 != 0)
							   {
								   System.out.print("5");
							   }
							   if (is7 != 0)
							   {
								   System.out.print("7");
							   }
					}
		  }
	}

}

