package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k = 0;
		  int p = 0;
		  int m = 0;
		  int n;
		  int i;
		  int j;
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  int[] c = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < 100000;i++)
		  {
							c[i] = 0;
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[0] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[0] = Integer.parseInt(tempVar3);
		  }
		  for (i = 1;(a[i - 1] != 0) || (b[i - 1] != 0);i++)
		  {
						  String tempVar4 = ConsoleInput.scanfRead();
						  if (tempVar4 != null)
						  {
							  a[i] = Integer.parseInt(tempVar4);
						  }
						  String tempVar5 = ConsoleInput.scanfRead(" ");
						  if (tempVar5 != null)
						  {
							  b[i] = Integer.parseInt(tempVar5);
						  }
						  k++;
		  }
		  for (j = 0;j < n;j++)
		  {
						  for (i = 0;i < k;i++)
						  {
										  if (b[i] == j)
										  {
										  c[j]++;
										  }
						  }
		  }
		  for (j = 0;j < n;j++)
		  {
						  for (i = 0;i < k;i++)
						  {
										  if (a[i] == j)
										  {
										  break;
										  }
										  else
										  {
										  m++;
										  }
						  }
						  if ((c[j] == n - 1) && (m == k))
						  {
									   System.out.printf("%d",j);
									   p++;
									   break;
						  }
						  m = 0;
		  }
		  if (p == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
	}


}

