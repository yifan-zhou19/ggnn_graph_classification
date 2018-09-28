package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[30][30];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		   if (i - 1 >= 0)
		   {
			 if (a[i - 1][j] > a[i][j])
			 {
				 continue;
			 }
		   }
		   if (i + 1 < m)
		   {
			  if (a[i + 1][j] > a[i][j])
			  {
				  continue;
			  }
		   }
		   if (j - 1 >= 0)
		   {
				if (a[i][j - 1] > a[i][j])
				{
					continue;
				}
		   }
			 if (j + 1 < n)
			 {
				   if (a[i][j + 1] > a[i][j])
				   {
					   continue;
				   }
			 }
				   System.out.printf("%d %d\n",i,j);
		 }
		}
				   System.in.read();
				   System.in.read();
	}

}

