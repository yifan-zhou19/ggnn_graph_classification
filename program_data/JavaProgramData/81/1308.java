package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int k;
		  int s;
		  int p;
		  int n;
		  int m;
		  int temp = 0;
		  int panduan = new int(int a[5][5],int n,int m);
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
			  n = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  m = Integer.parseInt(tempVar3);
		  }

		  if (panduan(a, n, m) != 0)
		  {

			  for (s = 0;s < 4;s++)
			  {
				  System.out.printf("%d %d %d %d %d\n",a[s][0],a[s][1],a[s][2],a[s][3],a[s][4]);
			  }
			  System.out.printf("%d %d %d %d %d",a[4][0],a[4][1],a[4][2],a[4][3],a[4][4]);
		  }
		  else
		  {
		  System.out.print("error");
		  }

		  System.in.read();
		  System.in.read();

	}

	public static int panduan(int[][] a, int n, int m)
	{
		int k;
		int temp;
		if (n < 5 && n >= 0 && n != m && m >= 0 && m < 5)
		{
		for (k = 0;k < 5;k++)
		{
				  temp = a[n][k];
				  a[n][k] = a[m][k];
				  a[m][k] = temp;
		}
		return (1);
		}
		else
		{
		return (0);
		}
	}


}

