package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int i = 3;
	   int n = 2;
	   int j;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   while (i <= m / 2)
	   {
			 while (n < i)
			 {
			  if (i % n != 0)
			  {
					 if (n >= i - 1)
					 {
							j = m - i;
							n = 2;
						 while (n < j)
						 {
									   if (j % n != 0)
									   {
															if (n >= j - 1)
															{
												System.out.print(i);
												System.out.print(" ");
												System.out.print(j);
												System.out.print("\n");
															}
											   n++;
									   }
										  else
										  {
											  n = j;
										  }
						 }
						  n = i - 1;
					 }
					   n++;
			  }
				else
				{
					n = i;
				}
			 }
			 i++;
			 n = 2;
	   }

		return 0;
	}
}

