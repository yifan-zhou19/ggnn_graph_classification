package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] m = new int[100];
		int[] n = new int[100];
		int[] he = new int[100];
		int[][] a = new int[100][100];
		int i;
		int j;
		int l;
		int total;

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
			for (j = 0;j < m[i];j++)
			{
				for (l = 0;l < n[i];l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][l] = Integer.parseInt(tempVar4);
					}
				}
			}
			total = 0;
			for (l = 0;l < n[i];l++)
			{
				total = total + a[0][l] + a[m[i] - 1][l];
			}
			for (j = 1;j < m[i] - 1;j++)
			{
				total = total + a[j][0] + a[j][n[i] - 1];
			}
			he[i] = total;
		}

		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d\n",he[i]);
		}
		System.out.printf("%d",he[k - 1]);




		return 0;
	}
}

