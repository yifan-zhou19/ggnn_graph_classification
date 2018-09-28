package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int q;
		int k;
		int m;
		int n;
		int[][] a = new int[110][110];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
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
			for (j = 0;j < m;j++) //??
			{
				for (q = 0;q < n;q++) //??
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(a + j) + q = tempVar4;
					}
				}
			}
		/*	for(j=0;j<m;j++)
			{
				for(q=0;q<n;q++)
				{
					printf("%d ",*(*(a+j)+q));
				}
				printf("\n");
			}*/
			//debug????bug
			for (j = 0;j < n;j++) //??
			{
				sum += *(a + j);
				if (m != 1)
				{
					sum += *(*(a + m - 1) + j);
				}
			}
			for (j = 1;j < m - 1;j++) //??
			{
				sum += *(*(a + j));
				if (n != 1) //???????????
				{
					sum += *(*(a + j) + n - 1);
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

