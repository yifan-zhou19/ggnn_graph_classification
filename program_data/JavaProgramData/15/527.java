package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[1000][1000];
		int n;
		int i;
		int j;
		int point1;
		int point2;
		int row1;
		int colum1;
		int row2;
		int colum2;
		int num;
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
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
				  point1 = a[i][j];
				  row1 = i;
				  colum1 = j;
				  i = n + 1;
				  break;
				}
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
			  if (a[i][j] == 0)
			  {
					point2 = a[i][j];
					row2 = i;
					colum2 = j;
					i = -1;
					break;
			  }
			}
		}
	num = (row2 - row1 - 1) * (colum2 - colum1 - 1);
	System.out.printf("%d\n",num);
	}




}

