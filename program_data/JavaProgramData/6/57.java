package <missing>;

public class GlobalMembers
{
	//int* getmemory(int m,int n)
	//{
	//	int *p=(int*)calloc(m,sizeof(int)*n);
	//	return p;
	//}
	public static int count(int b,int c)
	{
		int m = b;
		int n = c;
		int i;
		int j;
		int sum;
		int[][] num = new int[100][100];
		(int)(*a)[100];
	//	*a=getmemory(m,n);
		a = num;
		sum = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
				}
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(a + i) + (n - 1) = tempVar2;
			}
		}
		for (j = 0;j < n;j++)
		{
			sum = sum + (*(*a + j)) + (*(*(a + m - 1) + j));
		}
		for (i = 1;i < m - 1;i++)
		{
			sum = sum + (*(*(a + i))) + (*(*(a + i) + (n - 1)));
		}
		return sum;
	}

	public static void Main()
	{
		int i;
		int k;
		int m;
		int n;
		int[] sum = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			sum[i] = count(m, n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
	}
}

