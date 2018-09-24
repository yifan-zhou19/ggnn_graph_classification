package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[1000][1000];
	int i;
	int j;
	int n;
	int t;
	int i1 = 0;
	int j1 = 0;
	int i2 = 0;
	int j2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
			for (j = 0;j <= n - 1;j++)
			{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar2);
			 }
			}
	}
	for (i = 0;i <= n - 1;i++)
	{
		{
			for (j = 0;j <= n - 1;j++)
			{
			 if (a[i][j] == 0)
			 {
					 i1 = i;
				  j1 = j;
				  break;
			 }
			}
	}
		if (a[i1][j1] == 0)
		{
			break;
		}
	}
	for (i = n - 1;i >= i1;i--)
	{
		{
			for (j = n - 1;j >= 0;j--)
			{
			 if (a[i][j] == 0)
			 {
					 i2 = i;
				  j2 = j;
				  break;
			 }
			}
		 if (a[i2][j2] == 0)
		 {
			 break;
		 }
  }
	}
	t = (i2 - i1 - 1) * (j2 - j1 - 1);
	System.out.printf("%d",t);
	return 0;
	}

}

