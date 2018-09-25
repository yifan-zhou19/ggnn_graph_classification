package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[21][21];
		int i;
		int j;
		int k;
		int m;
		int n;
		for (i = 0;i < 21;i++)
		{
		 for (j = 0;j < 21;j++)
		 {
		  a[i][j] = 0;
		 }
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < m + 1;i++)
		{
		 for (j = 1;j < n + 1;j++)
		 {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		 }
		}
		for (i = 1;i < m + 1;i++)
		{
			 for (j = 1;j < n + 1;j++)
			 {
				  if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
				  {
					System.out.printf("%d %d\n",i - 1,j - 1);
				  }
			 }
		}



	}

}

