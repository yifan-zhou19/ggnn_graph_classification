package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int[][] a = new int[6][6];
		  int m;
		  char c;
		  m = 0;
		  for (i = 1;i <= 5;i++)
		  {
			   for (j = 1;j <= 5;j++)
			   {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar);
				  }
				  String tempVar2 = ConsoleInput.scanfRead(null, 1);
				  if (tempVar2 != null)
				  {
					  c = tempVar2.charAt(0);
				  }
			   }
		  }
		  for (i = 1;i <= 5;i++)
		  {
			   for (j = 1;j <= 5;j++)
			   {
					for (k = 1;k <= 5;k++)
					{
					   if (k == j)
					   {
						   continue;
					   }
					   if (a[i][j] < a[i][k])
					   {
						   break;
					   }
					}
					if (k != 6)
					{
						continue;
					}

					for (k = 1;k <= 5;k++)
					{
					   if (k == i)
					   {
						   continue;
					   }
					   if (a[i][j] > a[k][j])
					   {
						   break;
					   }
					}
					if (k == 6)
					{
						System.out.printf("%d %d %d",i,j,a[i][j]);
						m++;
						break;
					}
			   }
		  }
		  if (m == 0)
		  {
			  System.out.print("not found");
		  }
	}
}

