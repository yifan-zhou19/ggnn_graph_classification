package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (x = 1;x <= n;x++)
		{
			int j;
			int i;
			int[][] a = new int[MAX][MAX];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
			int p;
			int sum = 0;
			p = a[0][0];
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						p + 101 * i + j = Integer.parseInt(tempVar2);
					}
				}
			}
			for (k = n;k >= 2;k--) //??????????
			{
				for (i = 0;i < k;i++)
				{
					int min = (*(a + i)); //????????????
					for (j = 0;j < k;j++)
					{
						if (*(*(a + i) + j) < min)
						{
							min = (*(a + i) + j); //????
						}
					}
					for (j = 0;j < k;j++)
					{
						*(*(a + i) + j) = *(*(a + i) + j) - min; //????????
					}
				}
				for (j = 0;j < k;j++)
				{
					int min = (a + j); //????????????
					for (i = 0;i < k;i++)
					{
						if (*(*(a + i) + j) < min)
						{
							min = (*(a + i) + j); //????
						}
					}
					for (i = 0;i < k;i++)
					{
						*(*(a + i) + j) = *(*(a + i) + j) - min; //????????
					}
				}
				sum = sum + *(*(a + 1) + 1); //?????
				for (i = 1;i < k - 1;i++)
				{
					for (j = 0;j < k;j++)
					{
						*(*(a + i) + j) = *(*(a + i + 1) + j); //????????1????????????
					}
				}
				for (j = 1;j < k - 1;j++)
				{
					for (i = 0;i < k;i++)
					{
						*(*(a + i) + j) = *(*(a + i) + j + 1); //????????1????????????
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

