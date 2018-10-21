package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][2];
		int[][] num = new int[100][100];
		int[] result = new int[100];
		int row;
		int col;
		int i;


		for (row = 0; row < 100; row++) //???????
		{
			for (col = 0; col < 2; col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[row][col] = Integer.parseInt(tempVar);
				}
			}
			if (sz[row][1] == 0)
			{
				break;
			}
		}


		for (row = 0; row < 100; row++) //??????
		{
			if (sz[row][0] == 0) //??0?????
			{
				break;
			}
			num[row][0] = 1;
			//?????????

			if (sz[row][0] == 1)
			{
				result[row] = 1;
			}
			for (i = 1; i < sz[row][0]; i++)
			{

				num[row][i] = (num[row][i - 1] + sz[row][1]) % (i + 1);
				//n????????=??n-1????????+m??n??

				if (num[row][i] == 0) //????=0?????n
				{
					num[row][i] = i + 1;
				}
				result[row] = num[row][i];
				//?????result???
			}
			System.out.printf("%d\n",result[row]);

		}
		return 0;
	}


}

