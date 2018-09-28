package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] m = new int[100];
		int[] n = new int[100];
		int[][] a = new int[100][10000];
		int i;
		int j;
		int s;
		int sum = 0;
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
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			s = m[i] * n[i];
			for (j = 0;j < s;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0,sum = 0;j < m[i] * n[i];j++)
			{
				if (j < n[i])
				{
					sum = sum + a[i][j];
				}
				else if (j % n[i] == 0)
				{
					sum = sum + a[i][j];
				}
				else if ((j + 1) % n[i] == 0)
				{
					sum = sum + a[i][j];
				}
				else if (j > m[i] * n[i] - n[i] - 1)
				{
					sum = sum + a[i][j];
				}
				else
				{
					continue;
				}
			}
			if (i == 0)
			{
				System.out.printf("%d",sum);
			}
			else
			{
				System.out.printf("\n%d",sum);
			}

		}
		return 0;
	}






}

