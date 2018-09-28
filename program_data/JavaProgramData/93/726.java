package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	b = a % 3;
	c = a % 5;
	d = a % 7;
	if (b == 0 & c == 0 & d == 0)
	{
		System.out.printf("%d %d %d",3,5,7);
	}
	else if (b == 0 & c == 0)
	{
		System.out.printf("%d %d",3,5);
	}
		  else if (b == 0 & d == 0)
		  {
			  System.out.printf("%d %d",3,7);
		  }
				else if (c == 0 & d == 0)
				{
					System.out.printf("%d %d",5,7);
				}
					  else if (b == 0)
					  {
						  System.out.printf("%d",3);
					  }
							else if (c == 0)
							{
								System.out.printf("%d",5);
							}
								  else if (d == 0)
								  {
									  System.out.printf("%d",7);
								  }
									   else
									   {
										   System.out.print("n");
									   }

	return 0;

	}

}

