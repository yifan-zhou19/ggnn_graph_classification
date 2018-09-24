package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int n = 0;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[101];
		int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *h[101];
		int[] h = new int[101];
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
		for (i = 0;i < row;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			h[i] = a[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * col);
			for (j = 0;j < col;j++,a[i]++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (col == 1)
		{
			for (i = 0;i < row;i++)
			{
				System.out.printf("%d\n",h[i]);
			}
		}
		else
		{
		for (i = 0;i < row;i++)
		{
			a[i] = h[i];
		}
		for (i = 0;i < row + col + 1;i++)
		{
			for (j = 0;j <= i != 0 && j < row;j++)
			{
				if (a[j] != h[j] + col)
				{
					System.out.printf("%d\n",a[j]);
					a[j]++;
				}
				else
				{
					continue;
				}
			}
			if (a[j] == h[row - 1] + col - 1)
			{
				break;
			}
		}
		}
	}
}

