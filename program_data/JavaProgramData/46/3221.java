package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrix = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int row;
		int col;
		int counter = 0;
		int sum;
		int flag;
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
		sum = row * col;
		for (i = 0;i < row;i++)
		{
						   for (j = 0;j < col;j++)
						   {
						   String tempVar3 = ConsoleInput.scanfRead();
						   if (tempVar3 != null)
						   {
							   matrix[i][j] = Integer.parseInt(tempVar3);
						   }
						   }
		}
		for (flag = 0;;flag++)
		{
							for (j = flag;j < col - flag;j++)
							{
													   System.out.printf("%d\n",matrix[flag][j]);
													   counter++;
							}
							if (counter == sum)
							{
							break;
							}
							for (i = flag + 1;i < row - flag;i++)
							{
														 System.out.printf("%d\n",matrix[i][col - 1 - flag]);
														 counter++;
							}
							if (counter == sum)
							{
							break;
							}
							for (j = col - 2 - flag;j >= flag;j--)
							{
														  System.out.printf("%d\n",matrix[row - 1 - flag][j]);
														  counter++;
							}
							if (counter == sum)
							{
							break;
							}
							for (i = row - 2 - flag;i > flag;i--)
							{
														 System.out.printf("%d\n",matrix[i][flag]);
														 counter++;
							}
							if (counter == sum)
							{
							break;
							}
		}
		return 0;
	}
}

