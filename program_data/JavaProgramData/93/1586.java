package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int w = 3;
		int z = 5;
		int x = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 3;
		c = a % 5;
		d = a % 7;
		if (b == 0 && c == 0 && d == 0)
		{
			System.out.printf("%d %d %d",w,z,x);
		}
		else if (b == 0 && c == 0)
		{
			System.out.printf("%d %d",w,z);
		}
		else if (b == 0 && d == 0)
		{
			System.out.printf("%d %d",w,x);
		}
		else if (c == 0 && d == 0)
		{
			System.out.printf("%d %d",z,x);
		}
			  else if (b == 0)
			  {
				  System.out.printf("%d",w);
			  }
				   else if (c == 0)
				   {
					   System.out.printf("%d",z);
				   }
						else if (d == 0)
						{
							System.out.printf("%d",x);
						}
							  else
							  {
								  System.out.print("n");
							  }
		 return 0;

	}


}

