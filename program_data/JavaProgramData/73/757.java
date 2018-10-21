package <missing>;

public class GlobalMembers
{
	public static int max(int m1,int m2,int m3,int m4,int m5)
	{
		if (m1 > m2)
		{
			m2 = m1;
		}
		if (m2 > m3)
		{
			m3 = m2;
		}
		if (m3 > m4)
		{
			m4 = m3;
		}
		if (m4 > m5)
		{
			m5 = m4;
		}
		return m5;
	}
	public static int min(int n1,int n2,int n3,int n4,int n5)
	{
		if (n1 < n2)
		{
			n2 = n1;
		}
		if (n2 < n3)
		{
			n3 = n2;
		}
		if (n3 < n4)
		{
			n4 = n3;
		}
		if (n4 < n5)
		{
			n5 = n4;
		}
		return n5;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int[] min1 = new int[5];
		int[] max2 = new int[5];
		for (int i = 0;i < 5;i++)
		{
			min1[i] = min(a[0][i], a[1][i], a[2][i], a[3][i], a[4][i]);
		}
		for (int i = 0;i < 5;i++)
		{
			max2[i] = max(a[i][0], a[i][1], a[i][2], a[i][3], a[i][4]);
		}
		int count = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				if (a[i][j] == min1[j] && a[i][j] == max2[i])
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					count = 1;
				}
			}
		}
		if (count == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

