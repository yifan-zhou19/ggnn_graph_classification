package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] juzhen = new int[5][5]; //juzhen??????,i,j???????????max?????min????
		int pan = 0;
		int i;
		int j;
		int[] max = new int[5];
		int[] min = new int[5];
		for (i = 0;i < 5;i++)
		{
						max[i] = -100000;
						for (j = 0;j < 5;j++)
						{
										juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
										if (juzhen[i][j] > max[i])
										{
											max[i] = juzhen[i][j]; //?????
										}
						}
		}
		for (j = 0;j < 5;j++)
		{
						min[j] = 100000;
						for (i = 0;i < 5;i++)
						{
										if (juzhen[i][j] < min[j])
										{
											min[j] = juzhen[i][j]; //?????
										}
						}
		}
		for (i = 0;i < 5;i++)
		{
						for (j = 0;j < 5;j++)
						{
										if ((juzhen[i][j] == max[i]) && (juzhen[i][j] == min[j])) //??????????????
										{
																						   System.out.print(i + 1);
																						   System.out.print(" ");
																						   System.out.print(j + 1);
																						   System.out.print(" ");
																						   System.out.print(juzhen[i][j]);
																						   pan++; //???????pan???
										}
						}
		}
		if (pan == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

