package <missing>;

public class GlobalMembers
{
	public static int Main()
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
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *head=(int *)calloc(row *col,sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		int head = (int)calloc(row * col,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (p = head;p < head + row * col;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}
		int i;
		int j;
		int jj;
		int ii;
		for (j = 0;j < col;j++)
		{
			for (jj = j, i = 0;jj >= 0 && i < row;jj--, i++)
			{
				System.out.printf("%d\n",*(head + col * i + jj));
			}
		}
		for (i = 1;i < row;i++)
		{
			for (ii = i, j = col - 1;j >= 0 && ii < row;j--, ii++)
			{
				System.out.printf("%d\n",*(head + col * ii + j));
			}
		}
		return 0;
	}

}

