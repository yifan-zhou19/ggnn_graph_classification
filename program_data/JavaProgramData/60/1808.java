package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		n = 0;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 2;a <= n;a++)
		{
						 d = 0;
						 c = 0;
						 for (b = 2;b < a;b++)
						 {
										  if ((a - (a / b) * b) == 0)
										  {
											  c = 100;
										  }
						 }
						 if (c == 0)
						 {
										  d = a - 2;
										  {
												  for (b = 2;b < d;b++)
												  {
																  if ((d - (d / b) * b) == 0)
																  {
																	  c = 100;
																  }
												  }
										  }
						 }
						 if (d <= 2)
						 {
							 c = 100;
						 }
						 if (c == 0)
						 {
								  System.out.printf("%d %d\n",d,a);
								  e = 100;
						 }
		}
		if (e == 0)
		{
			System.out.print("empty");
		}
	}

}

