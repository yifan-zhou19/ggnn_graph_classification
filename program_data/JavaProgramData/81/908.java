package <missing>;

public class GlobalMembers
{
	public static int judge(int n,int m)
	{
		if ((n >= 0) && (m >= 0) && (n <= 4) && (m <= 4))
		{
		  return (1);
		}
		else
		{
		  return (0);
		}
	}

	public static int Main()
	{
	  int judge = new int(int n,int m);
	  int n;
	  int m;
	  int[][] a = new int[5][5];
	  int i;
	  int j;
	  int flag;
	  int t;
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
		   scanf("\n");
	  }
	  scanf("\n");
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
	  /*for(i=0;i<=4;i++)
	  {
	      for(j=0;j<=4;j++)
	         printf("%d ",a[i][j]);
	  }*/
	  flag = judge(n, m);
	  if (flag == 0)
	  {
	  System.out.print("error");
	  }
	  else
	  {
		  for (j = 0;j <= 4;j++)
		  {
			  t = a[n][j];
			  a[n][j] = a[m][j];
			  a[m][j] = t;
		  }
		  for (i = 0;i <= 4;i++)
		  {
			  for (j = 0;j <= 4;j++)
			  {
				  if (j == 0)
				  {
				  System.out.printf("%d",a[i][j]);
				  }
				  else
				  {
					  if ((j == 4) && (i != 4))
					  {
						 System.out.printf(" %d\n",a[i][j]);
					  }
					  else
					  {
						  if ((j == 4) && (i == 4))
						  {
							System.out.printf(" %d",a[i][j]);
						  }
						  else
						  {
							System.out.printf(" %d",a[i][j]);
						  }
					  }
				  }
			  }
		  }
	  }
	  return 0;
	}
}

