package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	int n;
	int sum;
	int a;
	int b;
	int c;
	int d;
	int s;
	int[][] pic = new int[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (row = 0;row < n;row++)
	{
	  for (col = 0;col < n;col++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  pic[row][col] = Integer.parseInt(tempVar2);
		  }
	  }
	}


	sum = 0;
	for (row = 0;row < n;row++)
	{
	  for (col = 0;col < n;col++)
	  {
				if ((pic[row][col] == 0) && (pic[row - 1][col - 1] == 255) && (pic[row - 1][col] == 255) && (pic[row][col - 1] == 255))
				{
					a = row;
				 b = col;
				}
	  }
	}


	for (row = n - 1;row >= 0;row--)
	{
	  for (col = n - 1;col >= 0;col--)
	  {
				if ((pic[row][col] == 0) && (pic[row + 1][col + 1] == 255) && (pic[row + 1][col] == 255) && (pic[row][col + 1] == 255))
				{
					c = row;
				 d = col;
				}
	  }
	}

	s = (c - a - 1) * (d - b - 1);
	System.out.printf("%d",s);

	return 0;
	}
}

