package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] image = new int[1000][1000];
		int n;
		int i;
		int j;
		int area;
		int begRow;
		int begCol;
		int endRow;
		int endCol;
		int isBreak;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   image[i][j] = Integer.parseInt(tempVar2);
			   }
			}
		}

		isBreak = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   if (image[i][j] == 0)
			   {
				  begRow = i;
				  begCol = j;
				  isBreak = 1;
				  break;
			   }
			}
			if (isBreak != 0)
			{
				break;
			}
		}

		for (i = begRow;i < n;i++)
		{
			   if (i == (n - 1) && image[i][begCol] == 0)
			   {
				   endRow = i;
			   }
			   else if (image[i][begCol] != 0)
			   {
				  endRow = i - 1;
				  break;
			   }
		}

		for (j = begCol;j < n;j++)
		{
			   if (j == (n - 1) && image[begRow][j] == 0)
			   {
				   endCol = i;
			   }
			   else if (image[begRow][j] != 0)
			   {
				  endCol = j - 1;
				  break;
			   }
		}

		area = (endRow - begRow - 1) * (endCol - begCol - 1);
		System.out.printf("%d", area);
	}
}

