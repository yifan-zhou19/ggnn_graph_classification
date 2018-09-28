package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] sl;
		int a;
		int b;
		int i;
		int j;
		int m;
		int c;
		int d;
		int row;
		int col;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		sl = new int[row];

		for (i = 0;i < row;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			sl[i] = (int)malloc(col * (Integer.SIZE / Byte.SIZE));
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sl[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
			   m = sl[i][j];
			   a = i;
			   b = j;
			   for (c = 0;c < col;c++)
			   {
				   if (sl[i][c] > m)
				   {
					   break;
				   }
				   if (c == col - 1)
				   {
					   for (d = 0;d < row;d++)
					   {
						   if (sl[d][j] < m)
						   {
							   break;
						   }
						   if (d == row - 1)
						   {
							   System.out.printf("%d+%d\n",a,b);
							   n++;
						   }
					   }
				   }
			   }
			}
		}
		if (n == 0)
		{
			System.out.print("No\n");
		}

	}

}

