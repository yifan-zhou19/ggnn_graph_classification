package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int number;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  number = n;
	  for (i = 0;i < number;i++)
	  {
		  int p;
		  int q;
		  int[][] a = new int[100][100];
		  int[] minnum = new int[100];
		  int sum = 0;
			  for (p = 0;p < number;p++)
			  {
				  for (q = 0;q < number;q++)
				  {
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 a[p][q] = Integer.parseInt(tempVar2);
					 }
				  }
			  }
			  n = number;
			   while (n > 1)
			   {
			   for (p = 0;p < n;p++)
			   {
				  for (q = 0;q < n;q++)
				  {
					   if (q == 0)
					   {
					minnum[p] = a[p][q];
					   }
					else if (minnum[p] > a[p][q])
					{
					minnum[p] = a[p][q];
					}
				  }
			   }
				 for (p = 0;p < n;p++)
				 {
					  for (q = 0;q < n;q++)
					  {
						 a[p][q] = a[p][q] - minnum[p];
					  }
				 }
				  for (q = 0;q < n;q++)
				  {
					  int tag = 0;
					  int min;
					for (p = 0;p < n;p++)
					{
						if (a[p][q] == 0)
						{
					 tag = 1;
						}
					 if (p == 0)
					 {
					 min = a[p][q];
					 }
					 else if (min > a[p][q])
					 {
					 min = a[p][q];
					 }
					}
					if (tag == 0)
					{
						for (p = 0;p < n;p++)
						{
						  a[p][q] -= min;
						}
					}
				  }
				 sum += a[1][1];
				 n--;
				for (j = 0,p = 0;p < n + 1;p++,j++)
				{
					  for (q = 0,k = 0;q < n + 1;q++,k++)
					  {
					   if (p == 1)
					   {
					  p++;
					   }
					  if (q == 1)
					  {
					  q++;
					  }
					  a[j][k] = a[p][q];
					  }
				}

			   }
			  System.out.printf("%d\n",sum);
	  }
	return 0;
	}

}

