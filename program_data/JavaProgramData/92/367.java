package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int[] a = new int[1001];
		  int[] b = new int[1001];
		  int t;
		  int f = 0;
		  while (true)
		  {
			  f++;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n == 0)
		  {
		  break;
		  }
		  for (i = 1;i <= n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 1;i <= n;i++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (i = 1;i < n;i++)
		  {
			   for (j = i + 1;j <= n;j++)
			   {
					 if (a[i] < a[j])
					 {
						   t = a[i];
						   a[i] = a[j];
						   a[j] = t;
					 }
			   }
		  }
		  for (i = 1;i < n;i++)
		  {
			   for (j = i + 1;j <= n;j++)
			   {
					 if (b[i] < b[j])
					 {
						   t = b[i];
						   b[i] = b[j];
						   b[j] = t;
					 }
			   }
		  }
		  int x1;
		  int x2 = 0;
		  int y1;
		  int s1;
		  int s;
		  int k;
		  for (k = n;k >= 1;k--)
		  {
		  x1 = 0,y1 = 0,x2 = 0;
		  for (i = n - k + 1;i <= n;i++)
		  {
			   if (b[i] < a[i - n + k])
			   {
			   x1++;
			   }
			   else if (b[i] == a[i - n + k])
			   {
			   y1++;
			   }
		  }
		  s1 = 400 * x1 + 200 * y1 - 200 * n;
		  if (k == n)
		  {
		  s = s1;
		  }
		  else if (s1 > s)
		  {
		  s = s1;
		  }
		  }
		  System.out.printf("%d\n",s);
		  }
	}

}

