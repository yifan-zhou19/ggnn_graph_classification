package <missing>;

public class GlobalMembers
{
	public static void Main()
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
		int[][] p;
		p = new int[100];
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			*(p + i) = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(p + i) + j = tempVar3;
				}
			}
		}
		for (j = 0;j < col - 1;j++)
		{
			int a = j;
			for (i = 0;a >= 0 && i < row;i++)
			{
				System.out.printf("%d\n",*(*(p + i) + a));
				a--;
			}
		}
		for (i = 0;i < row;i++)
		{
			int a = i;
			for (j = col - 1;a < row && j >= 0;j--)
			{
				System.out.printf("%d\n",*(*(p + a) + j));
				a++;
			}
		}
	}








}

