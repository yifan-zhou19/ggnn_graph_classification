package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] n = new int[6];
	  int[] m = new int[6];
	  int sum = 0;
	  int i = 0;
	  for (n[5] = 1;n[5] <= 5;n[5]++)
	  {
		  if (n[5] == 2 || n[5] == 3)
		  {
			  continue;
		  }
		  for (n[2] = 1;n[2] <= 5;n[2]++)
		  {
			  if (n[2] == n[5])
			  {
				  continue;
			  }
			  for (n[1] = 1;n[1] <= 5;n[1]++)
			  {
				  if (n[1] == n[2] || n[1] == n[5])
				  {
					  continue;
				  }
				  for (n[3] = 1;n[3] <= 5;n[3]++)
				  {
					  if (n[1] == n[3] || n[2] == n[3] || n[5] == n[3])
					  {
						  continue;
					  }
					  n[4] = 15 - n[1] - n[2] - n[3] - n[5];
					  m[1] = (n[5] == 1);
					  m[2] = (n[2] == 2);
					  m[3] = (n[1] == 5);
					  m[4] = (n[3] != 1);
					  m[5] = (n[4] == 1);
					  sum = 0;
					  for (i = 1;i <= 5;i++)
					  {
						  if (m[i] == 1)
						  {
							  if (n[i] == 1 || n[i] == 2)
							  {
								  sum++;
							  }
						  }
						  else
						  {
							  if (n[i] == 3 || n[i] == 4 || n[i] == 5)
							  {
								  sum++;
							  }
						  }
					  }
					  if (sum == 5)
					  {
						  System.out.print(n[1]);
						  System.out.print(" ");
						  System.out.print(n[2]);
						  System.out.print(" ");
						  System.out.print(n[3]);
						  System.out.print(" ");
						  System.out.print(n[4]);
						  System.out.print(" ");
						  System.out.print(n[5]);
						  System.out.print("\n");
					  }
				  }
			  }
		  }
	  }


		 return 0;
	}
}
