package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int[][] a = new int[10][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(a + i) = tempVar2;
			}
		}
		for (i = 0;i < t;i++)
		{
			*(*(a + i) + 2) = 1;
			*(*(a + i) + 1) = 1;
			for (j = 3;j <= **(a + i);j++)
			{
				*(*(a + i) + j) = *(*(a + i) + j - 1) + *(*(a + i) + j - 2);
			}
			System.out.printf("%d\n",*(*(a + i) + --j));
		}
	}

}

