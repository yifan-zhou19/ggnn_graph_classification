package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i = 1;
		  int m;
		  int j;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		   int[] a = new int[n];
		  while (i <= n)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
		  a[i] = m;
		  i++;
		  }
		  int l = 1;
		  while (l <= n)
		  {
					 if (l == 1)
					 {
					 System.out.printf("%d",a[l]);
					 }
					 else
					 {
						 j = 1;
						 k = 0;
						 while (j < l)
						 {
							 if (a[l] == a[j])
							 {
						 k = k + 1;
							 }
						 j++;
						 }
					 if (k == 0)
					 {
					 System.out.printf(" %d",a[l]);
					 }
					 }
		  l++;
		  }
		  System.in.read();
		  System.in.read();
	}
}

