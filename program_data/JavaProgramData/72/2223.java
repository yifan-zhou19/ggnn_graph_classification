package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] moun = new int[30][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(moun + i) + j = tempVar3;
				}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (*(*(moun + i) + j) >= *(*(moun + i - 1) + j) && *(*(moun + i) + j) >= *(*(moun + i + 1) + j) && *(*(moun + i) + j) >= *(*(moun + i) + j - 1) && *(*(moun + i) + j) >= *(*(moun + i) + j + 1))
				{
				  System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}
}

