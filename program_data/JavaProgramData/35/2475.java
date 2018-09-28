package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int i;
		int j;
		int k = 0;
		int e;
		int m;
		int n;
		int temp = 0;
		int hang;
		int lie;
		int h = 0;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > temp)
				{
					temp = a[i][j];
					hang = i;
					lie = j;
				}
			}
			e = a[0][lie];
			for (k = 1;k < m;k++)
			{
				if (a[k][lie] < e)
				{
					e = a[k][lie];
					h = k;
				}
			}
			if (h == hang)
			{
				System.out.printf("%d+%d",hang,lie);
				break;
			}
			else
			{
				result = -1;
				continue;
			}
		}
		if (result == -1)
		{
			System.out.print("No");
		}
		return 0;
	}

}

