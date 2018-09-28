package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int[] mn = new int[5];
		int n;
		int m;
		int i;
		int j;
		int a;
		int panduan = new int(int sz[5][5], int x,int y);
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz[i][j] = Integer.parseInt(tempVar);
		}
		}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		a = panduan(sz, n, m);
		if (a == 0)
		{
		System.out.print("error");
		}
		else if (a == 1)
		{
	   for (i = 0;i < 5;i++)
	   {
		 for (j = 0;j < 4;j++)
		 {
		   System.out.printf("%d ",sz[i][j]);
		 }
		   System.out.printf("%d\n",sz[i][4]);
	   }
		}
	return 0;
	}
	public static int panduan(int[][] sz, int x, int y)
	{
		int a;
		int[] mn = new int[5];
		int i;
		int n;
	 if (0 <= x != 0 && x < 5 && 0 <= y != 0 && y < 5)
	 {
		a = 1;
		for (i = 0;i < 5;i++)
		{
		  mn[i] = sz[x][i];
		}
		for (i = 0;i < 5;i++)
		{
		  sz[x][i] = sz[y][i];
		}
		for (i = 0;i < 5;i++)
		{
		  sz[y][i] = mn[i];
		}
	 }
	 else
	 {
		a = 0;
	 }
	 return a;
	}

}

