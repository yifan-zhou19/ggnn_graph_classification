package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l = 0;
		int e;
		int m;
		int n;
		int f;
		int[][] a = new int[5][5];
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
		for (k = 0;k < 5;k++)
		{
			e = 0;
		 for (j = 0;j < 5;j++)
		 {

				if (a[k][j] > e)
				{
					e = a[k][j];
					m = j;
				}
		 }
		 for (i = 0;i < 5;i++)
		 {
			if (a[i][m] < e)
			{
			break;
			}
		 }
		 if (i == 5)
		 {
		 System.out.printf("%d %d %d",k + 1,m + 1,e);
		 l = 1;
		 }
		}
	   if (l == 0)
	   {
			System.out.print("not found");
	   }
			 return 0;
	}
}

