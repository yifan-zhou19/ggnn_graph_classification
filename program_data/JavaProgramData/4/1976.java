package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100][100];
		int[][] p = new int[100][100];
		int n;
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
		for (i = 0; i < 100; i++)
		{
			for (j = 0; j < 100; j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				*(*(p + i) + j) = (int)malloc(LEN);
			}
		}
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(*(p + i) + j) = tempVar3;
				}
			}
		}
			//printf ("%d", *(*(p+i)+j));}
		for (j = 1; j <= col; j++)
		{
			int h = 1;
			int l = j;
			while (l >= 1 && h <= row)
			{
				System.out.printf("%d\n", **(*(p + h) + l));
			h++;
			l--;
			}
		}
		for (i = 2; i <= row; i++)
		{
			int l = col;
			int h = i;
			while (l >= 1 && h <= row)
			{
				System.out.printf("%d\n", **(*(p + h) + l));
			h++;
			l--;
			}
		}
		return 0;
	}
}

