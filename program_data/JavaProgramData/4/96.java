package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int row;
		int col;
		int i;
		int j;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(row * col * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < row * col;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= col;i++)
		{
			j = i;
			while ((col != 1) && (j % col != 1) && (j + col - 1 < row * col))
			{
				System.out.printf("%d\n",*(p + j - 1));
				j = j + col - 1;
			}
			System.out.printf("%d\n",*(p + j - 1));
		}
		for (i = 2;i <= row;i++)
		{
			j = i * col;
			while ((col != 1) && (j % col != 1) && (j + col - 1 < row * col))
			{
				System.out.printf("%d\n",*(p + j - 1));
				j = j + col - 1;
			}
			System.out.printf("%d\n",*(p + j - 1));
		}
	}

}

