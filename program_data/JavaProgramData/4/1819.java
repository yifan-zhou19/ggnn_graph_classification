package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[100][100];
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		} //????

		int step = 0;
		i = 0;
		j = 0;
		int t;

		if (row * col > 0)
		{
			System.out.printf("%d",a[0][0]);
			step++;
		} //????????????

		while (step < row * col) //???
		{

			if (i + 1 < 0 || j - 1 < 0) //????????or???????
			{


				t = i;
				i = j;
				j = t + 1; //???????????????????????
				if (i < row && j < col) //??????????????????????...
				{
					System.out.printf("\n%d",a[i][j]);
				step++;
				}
			}
			else
			{
				i = i + 1;
				j = j - 1;
				if (i < row && j < col) //????????????????????
				{
					System.out.printf("\n%d",a[i][j]);
				step++;
				}
			}


		}

		return 0;
	}
}

