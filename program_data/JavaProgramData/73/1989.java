package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int i0;
		int j0;
		int k;
		int max;
		int min;
		int count = 0;
				for (i = 1; i < 6; i++)
				{
				   for (j = 1; j < 6; j++)
				   {
						a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				   }
				}
				for (i = 1; i < 6; i++)
				{
					i0 = i;
					j0 = 1;
					max = a[i][1];
					for (j = 1; j < 6; j++)
					{
						if (max >= a[i][j])
						{
							continue;
						}
						max = a[i][j];
						j0 = j;
						i0 = i; //?????????

					}
					for (k = 1; k < 6; k++)
					{
						if (max > a[k][j0])
						{
							break; //???????????
						}

					}

					if (k == 6)
					{
						System.out.print(i0);
						System.out.print(" ");
						System.out.print(j0);
						System.out.print(" ");
						System.out.print(max);
						System.out.print("\n");
						count++;
					}
				}
					 if (count == 0)
					 {
						 System.out.print("not found");
						 System.out.print("\n");
					 }

				return 0;
	}
}

