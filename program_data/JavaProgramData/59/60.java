package <missing>;

public class GlobalMembers
{
	public static char[][] map = new char[102][102];
	public static int[][] queue = new int[2][128 * 100 + 100 + 1]; //????????????????????
	public static int[] num = new int[2];



	public static int Main()
	{
		int i;
		int j;
		int N;
		int m;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(map,'#',(Character.SIZE / Byte.SIZE));

		//input
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				map[i][1] = tempVar2.charAt(0);
			}
			for (j = 1;j <= N;j++)
			{
				if (map[i][j] == '@')
				{
					queue[0][num[0]++] = (i << 7) + j;
				}
			}
			map[i][j] = '#';
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		//iteration
		sum = num[0];
		for (j = 0;j < m - 1;j++)
		{
			int tmp = j & 1; //????????
			for (i = 0;i < num[tmp];i++)
			{
				int x;
				int y;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
				x = queue[tmp][i] >> 7;
				y = queue[tmp][i] & 127;
				INFECT(x - 1,y,tmp == 0);
				INFECT(x + 1,y,tmp == 0);
				INFECT(x,y - 1,tmp == 0);
				INFECT(x,y + 1,tmp == 0);
			}
			num[tmp] = 0; //???????
			sum += num[tmp == 0];
		}

		//output
		System.out.printf("%d\n",sum);


		return 0;
	}


}

