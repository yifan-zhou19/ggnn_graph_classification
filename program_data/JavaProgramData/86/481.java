package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] m = new int[100];
		int k;
		int[] num = new int[100];
		int[][] f = new int[100][100];
		int[] count = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			count[i] = 0;
			num[i] = 0;
			for (j = 1;j <= 60 - count[i];j++)
			{
				for (k = 0;k < m[i];k++)
				{
					if (j == f[i][k])
					{
							count[i] += 3;
							break;
					}
				}
				num[i]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",num[i]);
		}
	}
}

