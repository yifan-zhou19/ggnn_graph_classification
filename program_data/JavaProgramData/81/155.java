package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int[] e = new int[5];
		int i = 0;
		int j = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m < 5 && n < 5 && m != n && m >= 0 && n >= 0)
		{
		for (j = 0;j < 5;j++)
		{
			e[j] = a[m][j];
			a[m][j] = a[n][j];
			a[n][j] = e[j];
		}
		System.out.printf("%d ",a[0][0]);
		System.out.printf("%d ",a[0][1]);
		System.out.printf("%d ",a[0][2]);
		System.out.printf("%d ",a[0][3]);
		System.out.printf("%d\n",a[0][4]);
		System.out.printf("%d ",a[1][0]);
		System.out.printf("%d ",a[1][1]);
		System.out.printf("%d ",a[1][2]);
		System.out.printf("%d ",a[1][3]);
		System.out.printf("%d\n",a[1][4]);
		System.out.printf("%d ",a[2][0]);
		System.out.printf("%d ",a[2][1]);
		System.out.printf("%d ",a[2][2]);
		System.out.printf("%d ",a[2][3]);
		System.out.printf("%d\n",a[2][4]);
		System.out.printf("%d ",a[3][0]);
		System.out.printf("%d ",a[3][1]);
		System.out.printf("%d ",a[3][2]);
		System.out.printf("%d ",a[3][3]);
		System.out.printf("%d\n",a[3][4]);
		System.out.printf("%d ",a[4][0]);
		System.out.printf("%d ",a[4][1]);
		System.out.printf("%d ",a[4][2]);
		System.out.printf("%d ",a[4][3]);
		System.out.printf("%d\n",a[4][4]);
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

