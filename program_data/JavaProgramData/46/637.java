package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int m;
	 int i1;
	 int i2;
	 int j1;
	 int j2;
	 int i;
	 int[][] a = new int[100][100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 for (i1 = 0;i1 <= n - 1;i1++)
	 {
		  for (j1 = 0;j1 <= m - 1;j1++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i1][j1] = Integer.parseInt(tempVar3);
			  }
		  }
	 }
	i1 = 0;
	j1 = 0;
	i2 = n - 1;
	j2 = m - 1;
	for (;;)
	{
		for (i = j1;i <= j2;i++)
		{
			System.out.printf("%d\n",a[i1][i]);
		}
		i1++;
		if (i1 > i2)
		{
			break;
		}
		for (i = i1;i <= i2;i++)
		{
			System.out.printf("%d\n",a[i][j2]);
		}
		j2--;
		if (j1 > j2)
		{
			break;
		}
		for (i = j2;i >= j1;i--)
		{
			System.out.printf("%d\n",a[i2][i]);
		}
		i2--;
		if (i1 > i2)
		{
			break;
		}
		for (i = i2;i >= i1;i--)
		{
			System.out.printf("%d\n",a[i][j1]);
		}
		j1++;
		if (j1 > j2)
		{
			break;
		}

	}
	}
}

