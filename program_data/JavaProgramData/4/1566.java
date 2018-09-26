package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int[][] array = new int[100][100];
	int sum;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < row;i++)
	{
	  for (j = 0;j < col;j++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  array[i][j] = Integer.parseInt(tempVar3);
	  }
	  }
	}
	if (row < col)
	{
	   for (sum = 0;sum <= row - 1;sum++)
	   {
		for (i = 0;i <= sum;i++)
		{
		 j = sum - i;
		 System.out.printf("%d\n",array[i][j]);
		}
	   }
	   for (sum = row;sum <= col - 1;sum++)
	   {
		for (i = 0;i <= row - 1;i++)
		{
		 j = sum - i;
		 System.out.printf("%d\n",array[i][j]);
		}
	   }
	   for (sum = col;sum <= col + row - 2;sum++)
	   {
		for (i = sum - col + 1;i <= row - 1;i++)
		{
		 j = sum - i;
		 System.out.printf("%d\n",array[i][j]);
		}
	   }
	}
	else
	{
	  for (sum = 0;sum <= col - 1;sum++)
	  {
		for (i = 0;i <= sum;i++)
		{
		 j = sum - i;
		 System.out.printf("%d\n",array[i][j]);
		}
	  }
	   for (sum = col;sum <= row - 1;sum++)
	   {
		for (i = sum - col + 1;i <= sum;i++)
		{
		 j = sum - i;
		 System.out.printf("%d\n",array[i][j]);
		}
	   }
	   for (sum = row;sum <= row + col - 2;sum++)
	   {
		for (i = sum - col + 1;i <= row - 1;i++)
		{
		 j = sum - i;
		 System.out.printf("%d\n",array[i][j]);
		}
	   }
	}
	return 0;
	}
}

