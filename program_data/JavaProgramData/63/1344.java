package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int m;
	  int n;
	  int p;
	  int q;
	  int sum = 0;
	  int i;
	  int j;
	  int k;
	  int ii;
	  int jj;
	  int[][] a = new int[100][100];
	  int[][] b = new int[100][100];
	  int[][] c = new int[100][100];
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
	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		}
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  p = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ");
	  if (tempVar5 != null)
	  {
		  q = Integer.parseInt(tempVar5);
	  }
	  for (i = 0;i < p;i++)
	  {
		for (j = 0;j < q;j++)
		{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[i][j] = Integer.parseInt(tempVar6);
			}
		}
	  } //input

	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < q;j++)
		{
		   for (ii = 0;ii < n;ii++)
		   {
			 sum = sum + (a[i][ii] * b[ii][j]);
		   }
		   c[i][j] = sum;
		   sum = 0;
		}
	  } //mluti

	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < q - 1;j++)
		{
		  System.out.printf("%d ",c[i][j]);
		}
		System.out.printf("%d\n",c[i][q - 1]);
	  }



	}

}

