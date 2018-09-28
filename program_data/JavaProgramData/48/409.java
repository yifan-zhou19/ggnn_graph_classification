package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y,int n,int m)
	{
		if (n > 0)
		{
		//int i,j;
		//f(x,y,n)=0;
		//for (i=x-1;i<=x+1;i++)
		//for (j=y-1;j<=y+1;j++)
		//f(x,y,n)=f(x,y,n)+f(i,j,n-1);
		//return f(x,y,n)+f(x,y,n-1);}
		return (f(x - 1, y - 1, n - 1, m) + f(x - 1, y, n - 1, m) + f(x - 1, y + 1, n - 1, m) + f(x, y - 1, n - 1, m) + 2 * f(x, y, n - 1, m) + f(x, y + 1, n - 1, m) + f(x + 1, y - 1, n - 1, m) + f(x + 1, y, n - 1, m) + f(x + 1, y + 1, n - 1, m));
		}
		else if (x == 5 && y == 5)
		{
		return m;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  int[][][] a = new int[12][12][n];
		  //a[5][5][0]=m;
		  for (i = 1;i <= 9;i++)
		  {
			  for (j = 1;j <= 9;j++)
			  {
				  a[i][j][n] = f(i, j, n, m);
			  }
		  }
		  for (i = 1;i <= 9;i++)
		  {
			  for (j = 1;j <= 8;j++)
			  {
				  System.out.printf("%d ",a[i][j][n]);
			  }
			  System.out.printf("%d\n",a[i][9][n]);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

