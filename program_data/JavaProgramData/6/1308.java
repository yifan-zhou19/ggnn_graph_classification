package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] juzhen = null; //??????
		int i;
		int j;
		int m;
		int num;
		int hang;
		int lie;
		int[][] input = new int[101][101];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < num;m++)
		{
						  hang = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						  lie = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						  int sum = 0; //??
						  for (i = 0;i < hang;i++)
						  {
							   for (j = 0;j < lie;j++)
							   {
								   input[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							   }
						  }
						  juzhen = input;
						  for (i = 0;i < hang;i++)
						  {
											 for (j = 0;j < lie;j++)
											 {
															   if ((i == 0) || (i == hang - 1) || (j == 0) || (j == lie-1)) //???????
															   {
															   sum = sum + *(juzhen[i] + j); //????
															   }
											 }
						  }
						  System.out.print(sum);
						  System.out.print("\n");
		}
		return 0;
	}

}

