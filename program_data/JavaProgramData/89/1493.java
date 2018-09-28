package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int k;
		  int l;
		  int sum;
		  int c;
		  int d;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] b = new int[n];
		  for (k = 0;k < n;k++)
		  {
			  a[k] = 0;
			  b[k] = 0;
		  }
		  for (i = 0;;i++)
		  {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   c = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead(" ");
					   if (tempVar3 != null)
					   {
						   d = Integer.parseInt(tempVar3);
					   }
					   a[c]++;
					   b[d]++;
					   if (c == 0 && d == 0)
					   {
					   break;
					   }
		  }
		  sum = 0;
		  for (j = 0;j <= n - 1;j++)
		  {
							if (a[j] == 0 && b[j] == n - 1)
							{
								 System.out.printf("%d",j);
								 sum++;
							}
		  }
		  if (sum == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
	}


}

