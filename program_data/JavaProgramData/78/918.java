package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] wei = new int[5];
		int i;
		int sum = 1;
		int max;
		int[] a = {0, 0, 0, 0, 0};

		for (wei[1] = 1;wei[1] <= 5;wei[1]++)
		{
				for (wei[2] = 1;wei[2] <= 5;wei[2]++)
				{
					for (wei[3] = 1;wei[3] <= 5;wei[3]++)
					{
						for (wei[4] = 1;wei[4] <= 5;wei[4]++)
						{
					   if ((wei[1] + wei[2]) == (wei[3] + wei[4]) && (wei[1] + wei[4]) > (wei[2] + wei[3]) && (wei[1] + wei[3] < wei[2]))
					   {
							   while (sum <= 4)
							   {
								   max = 0;
							   for (i = 1;i <= 4;i++)
							   {
								   if (wei[i] > max && a[i] == 0)
								   {
								max = wei[i];
								   }
							   }

							  if (max == wei[1])
							  {
								  System.out.print("z");
								  System.out.print(" ");
								  System.out.print(wei[1] * 10);
								  System.out.print("\n");
								  a[1] = 1;
							  }
							  if (max == wei[2])
							  {
								  System.out.print("q");
								  System.out.print(" ");
								  System.out.print(wei[2] * 10);
								  System.out.print("\n");
								  a[2] = 1;
							  }
							  if (max == wei[3])
							  {
								  System.out.print("s");
								  System.out.print(" ");
								  System.out.print(wei[3] * 10);
								  System.out.print("\n");
								  a[3] = 1;
							  }
							  if (max == wei[4])
							  {
								  System.out.print("l");
								  System.out.print(" ");
								  System.out.print(wei[4] * 10);
								  System.out.print("\n");
								  a[4] = 1;
							  }
							  max = 0;
							  sum++;
							   }


					   }
						}

					}
				}
		}
		return 0;
	}

}
