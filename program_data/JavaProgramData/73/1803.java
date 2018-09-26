package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] hang = new int[6][6];
		int[][] lie = new int[6][6];
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int hmax = -1000000;
		int lmin = 1000000;
		int hangh;
		int hangl;
		int lieh;
		int liel;
		int temp = 0;
		int n = 5;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(hang,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(lie,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][j] = Integer.parseInt(tempVar);
		}
		}
		}
		for (i = 1;i <= n;i++)
		{
			 for (j = 1;j <= n;j++)
			 {
			 if (a[i][j] > hmax)
			 {
			  hangh = i;
			  hangl = j;
			  hmax = a[i][j];
			 }
			 }
			hang[hangh][hangl] = 1;
			hmax = -1000000;
		}
		 for (i = 1;i <= n;i++)
		 {
		 for (j = 1;j <= n;j++)
		 {
			  if (a[j][i] < lmin)
			  {
				 lieh = j;
				 liel = i;
				 lmin = a[j][i];
			  }
		 }
		lie[lieh][liel] = 1;
		lmin = 1000000;
		 }
		for (i = 1;i <= 5;i++)
		{
		for (j = 1;j <= 5;j++)
		{
		if (hang[i][j] == 1 && lie[i][j] == 1)
		{
			System.out.printf("%d %d %d\n",i,j,a[i][j]);
		temp++;
		}
		}
		}
		if (temp == 0)
		{
		System.out.print("not found");
		}
	}

}

