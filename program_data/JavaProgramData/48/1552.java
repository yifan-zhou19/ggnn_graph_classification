public class bacteria
{
	   public int have;
	   public int add;
}

package <missing>;

public class GlobalMembers
{
	public static bacteria[][] a = new bacteria[11][11];
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int l;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(a,0,sizeof(bacteria) * 121);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[5][5].have = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (m = 1;m <= n;m++)
		{
						 for (i = 5 - n;i <= 5 + n;i++)
						 {
										  for (j = 5 - n;j <= 5 + n;j++)
										  {
														   for (k = -1;k <= 1;k++)
														   {
																			 for (l = -1;l <= 1;l++)
																			 {
																							   a[i][j].add += a[i + l][j + k].have;
																			 }
														   }
										  }
						 }
						 for (i = 5 - n;i <= 5 + n;i++)
						 {
										  for (j = 5 - n;j <= 5 + n;j++)
										  {
															   a[i][j].have += a[i][j].add;
															   a[i][j].add = 0;
										  }
						 }
		}
		for (i = 1;i < 10;i++)
		{
						 System.out.printf("%d",a[i][1].have);
						 for (j = 2;j < 10;j++)
						 {
										  System.out.printf(" %d",a[i][j].have);
						 }
						 System.out.print("\n");
		}
		return 0;
	}
}

