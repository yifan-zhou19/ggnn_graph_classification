package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int k;
		  int r;
		  int c;
		  int[][] a = new int[8][8];
		  int p;
		  int q;
		  int n = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  r = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(",");
		  if (tempVar2 != null)
		  {
			  c = Integer.parseInt(tempVar2);
		  }
		  for (i = 0;i < r;i++)
		  {
			  for (k = 0;k < c;k++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  (a[i][k]) = Integer.parseInt(tempVar3);
				  }
			  }
		  }
		  for (i = 0;i < r;i++)
		  {
			  for (k = 0;k < c;k++)
			  {
				  for (p = 0;p < c;p++)
				  {
					  if (a[i][k] < a[i][p])
					  {
						  break;
					  }
					  if (p == c - 1)
					  {
						  for (q = 0;q < r;q++)
						  {
							  if (a[i][k] > a[q][k])
							  {
								  break;
							  }
							  if (q == r - 1)
							  {
								  System.out.printf("%d+%d",i,k);
								  n = n + 1;
								  break;
							  }
						  }
					  }
					  if (n == 1)
					  {
						  break;
					  }
				  }
				  if (n == 1)
				  {
					break;
				  }
			  }
			  if (n == 1)
			  {
				break;
			  }
		  }
		  if (n == 0)
		  {
			  System.out.print("No");
		  }
		  return 0;
	}
}

