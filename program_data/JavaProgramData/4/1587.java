package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,i,j,row,col;
		int a;
		int i;
		int j;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = (int)calloc(200,200 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a + i * col + j = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < col;j++)
		{
			for (i = 1;(i < row + 1) && (i <= j + 1);i++)
			{
			System.out.printf("%d\n",*(a + (i - 1) * col + j + 1 - i));
			}
		}
		for (i = 1;i < row;i++)
		{
			for (j = 1;(j <= col) && (j < row + 1 - i);j++)
			{

					System.out.printf("%d\n",*(a + (i + j - 1) * col + col - j));
			}
		}
	}

}

