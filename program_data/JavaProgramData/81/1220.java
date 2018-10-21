package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int m;
		int n;
		int i;
		int k;
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m > 4 || n > 4)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				 for (k = 0;k < 5;k++)
				 {
					 if (i == m)
					 {
						 b[i][k] = a[n][k];
					 }
					 else if (i == n)
					 {
						 b[i][k] = a[m][k];
					 }
					 else
					 {
						 b[i][k] = a[i][k];
					 }
				 }
				  System.out.printf("%d %d %d %d %d\n",b[i][0],b[i][1],b[i][2],b[i][3],b[i][4]);
			}
		}
		 return 0;
	}
}

