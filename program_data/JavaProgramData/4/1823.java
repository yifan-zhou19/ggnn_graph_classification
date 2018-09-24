package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int[][] a = new int[100][100];
	int x = 0;
	int y = 0;
	int k = 0;
	int l = 0;
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
	for (i = 0;i < n;i++)
	{
	 for (j = 0;j < m;j++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i][j] = Integer.parseInt(tempVar3);
	  }
	 }
	}

	for (;;)
	{
	 System.out.printf("%d\n",a[x][y]);
	 if (x == n - 1 && y == m - 1)
	 {
		 break;
	 }
	 if (y == 0 || x == n - 1)
	 {
	   if (l == m - 1)
	   {
		   k++;
	   }
	   else
	   {
		   l++;
	   }
	   x = k;
	   y = l;
	   continue;
	 }
	 x++;
	 y--;
	}

	}

}

