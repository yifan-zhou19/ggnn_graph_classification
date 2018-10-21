package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int r;
		int s;
		int[][] a = new int[100][100];
		int j;
		int k = 1;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (k <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s = Integer.parseInt(tempVar3);
			}
			sum = 0;
			for (i = 0; i < r; i++)
			{
				for (j = 0; j < s; j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(a + i) + j = tempVar4;
					}
				}
			}
			if (r == 1)
			{
				for (i = 0; i < s; i++)
				{
					sum += *(*(a + 0) + i);
				}
			}
			else if (s == 1)
			{
				for (i = 0; i < r; i++)
				{
					sum += *(*(a + i) + 0);
				}
			}
			else
			{
				for (i = 0, j = 0; j < s - 1; j++)
				{
					sum += *(*(a + i) + j);
				}
				for (i = 0, j = s - 1; i < r - 1; i++)
				{
					sum += *(*(a + i) + j);
				}
				for (i = r - 1 ; j > 0; j--)
				{
					sum += *(*(a + i) + j);
				}
				for (j = 0; i > 0; i--)
				{
					sum += *(*(a + i) + j);
				}
			}
			System.out.printf("%d\n",sum);
			k++;
		}
	}
}

