package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] a = new int[100000][2];
		  int i;
		  int j;
		  for (i = 0;;i++)
		  {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   a[i][0] = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   a[i][1] = Integer.parseInt(tempVar3);
					   }

					   if (a[i][0] == 0 && a[i][1] == 0)
					   {
						   break;
					   }
		  }
		  int k;
		  int l;
		  k = i,l = 0;
		  int[] c = new int[100000];
		  for (i = 0;i < n;i++)
		  {
						  for (j = 0;j < k;j++)
						  {
										  if (i == a[j][0])
										  {
											  break;
										  }
						  }
										  if (j == k)
										  {
											  c[l] = i;
											  l++;
										  }
		  }
		  int m;
		  int p;
		  m = 0,p = 0;
		  for (i = 0;i < l;i++)
		  {
						  for (j = 0;j < k;j++)
						  {
										  if (a[j][1] == c[i])
										  {
											  m++;
										  }
						  }
										  if (m == n - 1)
										  {
											  System.out.printf("%d\n",c[i]);
											  p++;
										  }
		  }
						  if (p == 0)
						  {
							  System.out.print("NOT FOUND\n");
						  }
		  System.in.read();
		  System.in.read();
		  System.in.read();

	}

}

