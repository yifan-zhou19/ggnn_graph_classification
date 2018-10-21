package <missing>;

public class GlobalMembers
{
	public static int add(int m, int n)
	{
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
				 return 1;
		}
		else
		{
				return 0;
		}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int p;
		int b;
		int c;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (add(m, n) != 0)
		{
			for (p = 0;p < 5;p++)
			{
					 c = a[m][p];
					 a[m][p] = a[n][p];
					 a[n][p] = c;
			}
			 for (i = 0;i < 5;i++)
			 {
				for (j = 0;j < 5;j++)
				{
				  if (j == 4)
				  {
					  System.out.printf("%d\n",a[i][j]);
				  }
				  else
				  {
					   System.out.printf("%d ",a[i][j]);
				  }
				}
			 }
		}
		else
		{
			   System.out.print("error");
		}
		return 0;
	}



}

