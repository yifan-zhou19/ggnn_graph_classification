package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int k;
		int n;
		int m;
		int t;
		for (i = 0;i < 100;i++)
		{
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
			   break;
			  }
			  else
			  {
				  for (j = 0;j < n;j++)
				  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[j] = Integer.parseInt(tempVar2);
				  }
				  }
				  for (j = 0;j < n;j++)
				  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[j] = Integer.parseInt(tempVar3);
				  }
				  }
				  for (j = 0;j < n;j++)
				  {
				   for (k = 0;k < n - j - 1;k++)
				   {
					 if (a[k] < a[k + 1])
					 {
						 t = a[k];
						 a[k] = a[k + 1];
						 a[k + 1] = t;
					 }
				   }
				  }
				   for (j = 0;j < n;j++)
				   {
				   for (k = 0;k < n - j - 1;k++)
				   {
					 if (b[k] < b[k + 1])
					 {
						 t = b[k];
						 b[k] = b[k + 1];
						 b[k + 1] = t;
					 }
				   }
				   }

				  m = 0;
				  for (j = n - 1;j >= 0;j--)
				  {
					  if (a[j] > b[j])
					  {
						m++;
					  }
					  else
					  {
						if (a[0] > b[0])
						{
							m++;
						   for (k = 0;k < j;k++)
						   {
							 a[k] = a[k + 1];
							b[k] = b[k + 1];
						   }
						}
						  else
						  {
						 if (a[j] <= b[j])
						 {
							 if (a[j] != b[0])
							 {
							 m--;
							 for (k = 0;k < j;k++)
							 {
							 b[k] = b[k + 1];
							 }
							 }

						 }
						  }
					  }
				  }
				  System.out.printf("%d\n",m * 200);
			  }
		}
						System.in.read();
						System.in.read();
	}


}

