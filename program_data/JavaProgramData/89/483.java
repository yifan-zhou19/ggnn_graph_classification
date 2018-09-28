package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] x = new int[200000];
		  int[] y = new int[200000];
		  int i;
		  int j;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  do
		  {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 i = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 j = Integer.parseInt(tempVar3);
						 }
						 x[i]++;
						 y[j]++;
		  } while (i != 0 || j != 0);
		  for (k = 0;k < n;k++)
		  {
						  if (x[k] == 0 && y[k] == n - 1)
						  {
												System.out.printf("%d",k);
												break;
						  }
						  if (k == n)
						  {
								  System.out.print("NOT FOUND");
						  }
		  }
	}

}

