package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] max = new int[5];
		int[] b = new int[5];
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
				}
			} //??????????????????max[i]??
		}
			for (int i = 0;i < 5;i++)
			{
				for (int j = 0;j < 5;j++)
				{
					if (a[i][j] == max[i])
					{
						b[i] = j;
					}
				} //???????????????b[i]??
			}
				int andian = 0; //?andian??????????
				for (int x = 0;x < 5;x++)
				{ //??x?????????
					int num = 0; //??num???
					for (int i = 0;i < 5;i++)
					{
						if ((i != x) && (a[i][b[x]] <= max[x]))
						{
							break;
						}
							else
							{
								num++; //?????????max[x]??num++?i==x???num++
							}
					}
						if (num == 5)
						{
							andian = 1;
							System.out.print(x + 1);
							System.out.print(" ");
							System.out.print(b[x] + 1);
							System.out.print(" ");
							System.out.print(max[x]);
						}
				}
					if (andian == 0)
					{
						System.out.print("not found");
					}

					return 0;
	}

}

