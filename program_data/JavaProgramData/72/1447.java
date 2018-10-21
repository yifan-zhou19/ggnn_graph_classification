package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[25][25];
		  int n;
		  int m;
		  int day;
		  int i;
		  int j;
		  int k;
		  int square = 0;
		  int lenth = 0;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 1 ;i <= n;i++)
			{
			for (j = 1 ;j <= m;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
			}
			for (i = 1 ;i <= n;i++)
			{
				  for (j = 1 ;j <= m;j++)
				  {
					 if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
					 {
					 System.out.printf("%d %d\n",i - 1,j - 1);
					 }
				  }
			}
	}

}

