package <missing>;

public class GlobalMembers
{
	public static int matrix(int b,int c)
	{
		int l;
		if (c >= 0 && c < 5 && b >= 0 && b < 5)
		{
		  l = 1;
		}
		  else
		  {
			 l = 0;
		  }
		return l;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
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
		int n;
		int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (matrix(n, m) == 0)
		{
		  System.out.print("error");
		}
		  else
		  {
			 for (i = 0;i < 5;i++)
			 {
			   if (i == m)
			   {
				 i = n;
				 for (j = 0;j < 4;j++)
				 {
				   System.out.printf("%d ",a[i][j]);
				 }
				 System.out.printf("%d\n",a[i][4]);
				 i = m;
			   }
			   if (i == n)
			   {
				 i = m;
				 for (j = 0;j < 4;j++)
				 {
				   System.out.printf("%d ",a[i][j]);
				 }
				 System.out.printf("%d\n",a[i][4]);
				 i = n;
			   }
			   if (i != m && i != n)
			   {
				 for (j = 0;j < 4;j++)
				 {
				   System.out.printf("%d ",a[i][j]);
				 }
				 System.out.printf("%d\n",a[i][4]);
			   }
			 }
		  }
		return 0;
	}

}

