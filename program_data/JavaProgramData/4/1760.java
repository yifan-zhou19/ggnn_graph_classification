package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,row,col,*q,i,k;
		int p;
		int row;
		int col;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(row * col * (Integer.SIZE / Byte.SIZE));
		for (q = p;q < p + row * col;q++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < row + col - 1;k++)
		{
			if (k < col)
			{
				for (i = 0;i <= k != 0 && i < row;i++)
				{
					System.out.printf("%d\n",*(p + i * col + k - i));
				}
			}
			else
			{
				for (i = k - col + 1;i < row && i <= k;i++)
				{
					System.out.printf("%d\n",*(p + i * col + k - i));
				}
			}
		}
	}
}

