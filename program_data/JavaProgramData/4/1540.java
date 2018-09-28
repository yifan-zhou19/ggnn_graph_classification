package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] p;
		int num;
		int i;
		int j;
		int k;
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
		num = row * col;
		p = new int[row];
		for (i = 0;i < row;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			*(p + i) = (int)malloc(col * (Integer.SIZE / Byte.SIZE));
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
		for (i = 0;i < col + row - 1;i++)
		{
			k = 0;
			j = i;
			while (j >= 0 && k <= row)
			{
				if (j < col && k < row)
				{
					System.out.printf("%d\n",*(*(p + k) + j));
				}
				k = k + 1;
				j = j - 1;
			}
		}
		return 0;
	}
}

