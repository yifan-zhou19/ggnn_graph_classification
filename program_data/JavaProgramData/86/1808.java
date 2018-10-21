package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : tiaosheng.cpp
	// Author      :
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		 int num;
			   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   for (int i = 1;i <= num;i++)
			   {
				   int t;
				   int times = 0;
				  int[] a = new int[21];
				  t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  if (t == 0)
				  {
					  System.out.print(60);
					  System.out.print("\n");
				  }
				  else
				  {
					  for (int j = 0;j < t;j++)
					  {
						  a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					  }
					  if ((a[t - 1] + t * 3) < 60)
					  {
						  times = 60 - t * 3;
					  }
					   else
					   {
								for (int j = 0;j < t;j++)
								{

											 if ((a[j] + (j + 1) * 3) >= 60 && (a[j] + (j + 1) * 3) <= 63)
											 {
												 times = a[j];
												   break;
											 }
											 if ((a[j] + (j + 1) * 3) > 63)
											 {
												 times = a[j - 1] + 60 - a[j - 1] - j * 3;

												 break;
											 }

								}
					   }

							   System.out.print(times);
							   System.out.print("\n");

				  }

			   }
		return 0;
	}

}

