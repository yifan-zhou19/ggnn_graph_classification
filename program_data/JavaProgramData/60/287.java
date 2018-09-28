package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int m;
		  int[] x = new int[10000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
			 System.out.print("empty");
		  }
		  else
		  {
			  for (i = 3,k = 0;i <= n;i = i + 2)
			  {
							  for (j = 2;j < i;j = j++)
							  {
													 if (i % j == 0)
													 {
														  break;
													 }
							  }
							  if (j == i)
							  {
									x[k] = i;
									k++;
							  }
			  }
			  for (m = 0;m < k;m++)
			  {
							  if (x[m + 1] - x[m] == 2)
							  {
									   System.out.printf("%d %d\n",x[m],x[m + 1]);
							  }
			  }
		  }
		  System.in.read();
		  System.in.read();
	}







}

