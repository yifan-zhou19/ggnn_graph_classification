package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m; //e ????
		  int n;
		  int[] a = new int[301];
		  int c;
		  int d = 0;
		  int e = 0;
		  int N;
		  for (N = 0; ;N++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  if (n == 0)
		  {
		  break;
		  }
		  else
		  {
			  ;
		  }
		  for (c = 1;c <= n;c++)
		  {
		   a[c] = 1;
		  }
		   c = 0;
		   e = 0;
		 while (e < n - 1)
		 {
			  d = 0;
			while (d < m)
			{
				c++;
				if (c == n + 1)
				{
				c = 1;
				}
				else
				{
					;
				}
				if (a[c] == 1)
				{
				d++;
				}
				else
				{
					;
				}
			}
			a[c] = 0;
			e++;
		 }
		  //for (c=1;c<=n;c++)
		  // printf("%d\n",a[c]);
		  for (c = 1;c <= n;c++)
		  {
			  if (a[c] == 1)
			  {
				  System.out.printf("%d\n",c);
				  break;
			  }
			  else
			  {
				  ;
			  }
		  }
		  }
	}

}

