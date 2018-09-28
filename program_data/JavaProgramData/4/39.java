package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int row;
		int col;
		int m;
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
		int[] p = new int[col];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int [col])calloc(row,col * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < row;i++)
		{
		  for (j = 0;j < col;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  p[i] + j = tempVar3;
			  }
		  }
		}
		for (i = 0;i < col;i++)
		{
			   m = (i <= (row - 1)?i:(row - 1));
			for (j = 0;j <= m;j++)
			{
				System.out.printf("%d\n",*(p[j] + i - j));
			}
		}
		for (j = 0;j < row - 1;j++)
		{
			m = ((row - 1) <= (col + j)?(row - 1):(col + j));
			for (i = 1 + j;i <= m;i++)
			{
				System.out.printf("%d\n",*(p[i] + col - i + j));
			}
		}
	}
}

