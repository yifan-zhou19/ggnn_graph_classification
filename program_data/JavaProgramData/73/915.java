package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b,int c,int d,int e)
	{
		if (a > b && a > c && a > d && a > e)
		{
		return (a);
		}
		else if (b > a && b > c && b > d && b > e)
		{
		return (b);
		}
		else if (c > a && c > b && c > d && c > e)
		{
		return (c);
		}
		else if (d > a && d > b && d > c && d > e)
		{
		return (d);
		}
		else
		{
		return (e);
		}
	}
	public static int min(int a,int b,int c,int d,int e)
	{
		  if (a < b && a < c && a < d && a < e)
		  {
		return (a);
		  }
		 else if (b < a && b < c && b < d && b < e)
		 {
		return (b);
		 }
		else if (c < a && c < b && c < d && c < e)
		{
		return (c);
		}
		else if (d < a && d < b && d < c && d < e)
		{
		return (d);
		}
		else
		{
		return (e);
		}
	}
	public static int Main()
	{
		 int[][] a = new int[5][5];
		 int i;
		 int j;
		 int t = 0;
		 for (i = 0;i <= 4;i++)
		 {
						  for (j = 0;j <= 4;j++)
						  {
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  a[i][j] = Integer.parseInt(tempVar);
						  }
						  }
		 }
		 for (i = 0;i <= 4;i++)
		 {
						  for (j = 0;j <= 4;j++)
						  {
						  if (a[i][j] == max(a[i][0], a[i][1], a[i][2], a[i][3], a[i][4]) && a[i][j] == min(a[0][j], a[1][j], a[2][j], a[3][j], a[4][j]))
						  {
						  System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
						  t = 1;
						  break;
						  }
						  }
	if (t == 1)
	{
	break;
	}
		 }
						  if (t != 1)
						  {
						  System.out.print("not found");
						  }

	}

}

