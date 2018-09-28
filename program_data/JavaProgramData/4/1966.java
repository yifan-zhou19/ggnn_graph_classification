package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
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
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * row * col);
		for (i = 0;i < row * col;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Integer.parseInt(tempVar3);
			}
		}
		System.out.printf("%d\n",*p);
		p++;
		for (i = 1;i < col;i++,p++)
		{
			for (j = 0, k = 0;k <= i != 0 && (i + j) < (row * col);k++, j = j + col - 1)
			{
				 System.out.printf("%d\n",*(p + j));
			}
		}
		p += col - 1;
		for (i = 1;i <= (row - 1);i++,p += col)
		{
			for (j = 0, k = 0;k < (row - i) && k < col && *(p + j) != 0;k++, j = j + col - 1)
			{
				System.out.printf("%d\n",*(p + j));
			}
		}


	}
}

