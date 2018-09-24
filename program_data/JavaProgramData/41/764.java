package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int sum;
		for (a[1] = 1;a[1] <= 5;a[1]++)
		{
			for (a[2] = 1;a[2] <= 5;a[2]++)
			{
				if (a[2] != a[1])
				{
				  for (a[3] = 1;a[3] <= 5;a[3]++)
				  {
					  if (a[3] != a[1] && a[2] != a[3])
					  {
					   for (a[4] = 1;a[4] <= 5;a[4]++)
					   {
						   if (a[4] != a[3] && a[4] != a[2] && a[4] != a[1])
						   {
							 for (a[5] = 1;a[5] <= 5;a[5]++)
							 {
								 if ((a[5] == 15 - a[1] - a[2] - a[3] - a[4]) && a[5] != 2 && a[5] != 3)
								 {

									 sum = 0;
									 if (a[5] == 1 && (a[1] == 1 || a[1] == 2))
									 {
										 sum += 1;
									 }
									 if (a[2] == 2)
									 {
										 sum += 1;
									 }
									 if (a[1] == 5 && (a[3] == 1 || a[3] == 2))
									 {
										 sum += 1;
									 }
									 if (a[3] != 1 && (a[4] == 1 || a[4] == 2))
									 {
										 sum += 1;
									 }
									 if (a[4] == 1 && (a[5] == 1 || a[5] == 2))
									 {
										 sum += 1;
									 }
									 if (sum == 2 && ((a[5] == 1) + (a[2] == 2) + (a[3] != 1) + (a[4] == 1) + (a[1] == 5) == 2))
									 {
										 for (i = 1;i <= 4;i++)
										 {
											 System.out.print(a[i]);
											 System.out.print(" ");
										 }
										 System.out.print(a[5]);
										 System.out.print("\n");
									 }
								 }
							 }
						   }
					   }
					  }
				  }
				}
			}
		}

		return 0;
	}
}
