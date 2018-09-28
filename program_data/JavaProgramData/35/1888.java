package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[8][8];
	public static int hang(int h)
	{
		int i;
		int temp = a[h][0];
		int l = 0;
		for (i = 1;i < n;i++)
		{
			if (a[h][i] > temp)
			{
				temp = a[h][i];
				l = i;
			}
		}
		return l;
	}
	public static int lie(int l)
	{
		int i;
		int temp = a[0][l];
		int h = 0;
		for (i = 1;i < m;i++)
		{
			if (a[i][l] < temp)
			{
				temp = a[i][l];
				h = i;
			}
		}
		return h;
	}

	public static void Main()
	{
		int i;
		int j;
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
			if (lie(hang(i)) == i)
			{
				System.out.printf("%d+%d",i,hang(i));
				break;
			}
		}
		if (i == m)
		{
			System.out.print("No");
		}
	}

}

