package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b,int c,int d,int e)
	{
		int m = 0;
		if (m < a)
		{
		m = a;
		}
		if (m < b)
		{
		m = b;
		}
		if (m < c)
		{
		m = c;
		}
		if (m < d)
		{
		m = d;
		}
		if (m < e)
		{
		m = e;
		}
	}
	public static int min(int a,int b,int c,int d,int e)
	{
		int m = 100000;
		if (m > a)
		{
		m = a;
		}
		if (m > b)
		{
		m = b;
		}
		if (m > c)
		{
		m = c;
		}
		if (m > d)
		{
		m = d;
		}
		if (m > e)
		{
		m = e;
		}
	}
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int j;
		  int i;
		  int[] b = new int[5];
		  int[] c = new int[5];
		  int z = 0;
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
		  for (i = 0;i < 5;i++)
		  {
						  b[i] = max(a[i][0], a[i][1], a[i][2], a[i][3], a[i][4]);
		  }
		  for (i = 0;i < 5;i++)
		  {
						  c[i] = min(a[0][i], a[1][i], a[2][i], a[3][i], a[4][i]);
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
										  if (b[i] == c[j])
										  {
											  z = 1;
											  System.out.printf("%d %d %d\n",i + 1,j + 1,b[i]);
										  }
						  }
		  }
		  if (z == 0)
		  {
		  System.out.print("not found\n");
		  }
	}

}

