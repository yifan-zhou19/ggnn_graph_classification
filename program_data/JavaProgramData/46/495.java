package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int n;
		int count = 0;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		n = row * col;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;;k++)
		{
			for (p = array[k] + k;p < array[k] + col - k - 1;p++)
			{
				System.out.printf("%d\n", p);
				count++;
			}
			if (count == n)
			{
				break;
			}
			for (i = k;i < row - k;i++)
			{
				System.out.printf("%d\n",*(*(array + i) + col - k - 1));
				count++;
			}
			if (count == n)
			{
				break;
			}
			for (i = col - k - 2;i >= k;i--)
			{
				System.out.printf("%d\n",*(*(array + row - k - 1) + i));
				count++;
			}
			if (count == n)
			{
				break;
			}
			for (i = row - k - 2;i > k;i--)
			{
				System.out.printf("%d\n",*(*(array + i) + k));
				count++;
			}
			if (count == n)
			{
				break;
			}
		}
	}


}

