package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] ju = new int[10][10];
			int i;
			int j;
			int d = 0;
			int k;
			int e = 0;
			int f = 0;
			for (i = 0;i < 5;i++)
			{
					 for (j = 0;j < 5;j++)
					 {
					 ju[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 }
			}
			for (i = 0;i < 5;i++)
			{

							for (j = 0;j < 5;j++)
							{
								d = 0;
											for (k = 0;k < 5;k++)
											{
															if (ju[i][j] > ju[i][k])
															{
																				 d++;
															}
											}
											if (d == 4)
											{
												break;
											}
							}
							e = 0;
							for (k = 0;k < 5;k++)
							{
											if (ju[i][j] < ju[k][j])
											{
											e++;
											}
							}
							if (e == 4)
							{
								System.out.print(i + 1);
								System.out.print(' ');
								System.out.print(j + 1);
								System.out.print(' ');
								System.out.print(ju[i][j]);
								System.out.print("\n");
								f++;
							}
			}
			if (f == 0)
			{
				System.out.print("not found");
			}


	return 0;
	}

}

