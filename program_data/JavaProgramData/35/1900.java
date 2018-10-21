package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int[] t = new int[8];
		int[] k = new int[8];
		int l;
		int f;
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
			t[i] = a[i][0];
			k[i] = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > t[i])
				{
					t[i] = a[i][j];
					k[i] = j;
				}
			}
		}

		for (l = 0;l < m;l++)
		{
			f = 0;
			for (i = 0;i < m;i++)
			{
				if (a[i][k[l]] < t[l])
				{
				f = 1;
				break;
				}
			}
			if (f == 0)
			{
				System.out.printf("%d+%d",l,k[l]);
				break;
			}
		}
		if (f == 1)
		{
			System.out.print("No");
		}
	}


}

