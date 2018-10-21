package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int col;
		int row;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[1000];
		int[] p = new int[1000];
		for (i = 0;i < 1000;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
		}
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(p[i] + j) = tempVar3;
				}
			}
		}
		if (col > row)
		{
		for (i = 0;i < col;i++)
		{
		for (j = 0;j <= i;j++)
		{
			if (j < row)
			{
				System.out.printf("%d\n",*(p[j] + i - j));
			}
			else
			{
				break;
			}
		}
		}
		 for (i = 0;i < row;i++)
		 {
		for (j = 0;j < row;j++)
		{
			if (j + i + 1 < row)
			{
				System.out.printf("%d\n",*(p[j + i + 1] + col - j - 1));
			}
			else
			{
				break;
			}
		}
		 }
		}
		else
		{
		for (i = 0;i < col;i++)
		{
		for (j = 0;j <= i;j++)
		{
			if (j < row)
			{
				System.out.printf("%d\n",*(p[j] + i - j));
			}
			else
			{
				break;
			}
		}
		}
		 for (i = 0;i < row;i++)
		 {
		for (j = 0;j < col;j++)
		{
			if (j + i + 1 < row)
			{
				System.out.printf("%d\n",*(p[j + i + 1] + col - j - 1));
			}
			else
			{
				break;
			}
		}
		 }
		}
	}

}

