package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int t;
		  int m;
		  int x;
		  int y;
		  int p;
		  int q;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  for (;;)
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

		  for (i = 0;i < n;i = i + 1)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 0;i < n;i = i + 1)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (j = 0;j < n - 1;j = j + 1)
		  {
		  for (i = 0;i < n - 1 - j;i = i + 1)
		  {
		  if (a[i] < a[i + 1])
		  {
		  t = a[i];
		  a[i] = a[i + 1];
		  a[i + 1] = t;
		  }
		  }
		  }

		  for (j = 0;j < n - 1;j = j + 1)
		  {
		  for (i = 0;i < n - 1 - j;i = i + 1)
		  {
		  if (b[i] < b[i + 1])
		  {
		  t = b[i];
		  b[i] = b[i + 1];
		  b[i + 1] = t;
		  }
		  }
		  }
		  m = 0;
		  p = n - 1;
		  q = n - 1;
		  for (x = 0,y = 0;y <= q;)
		  {
		  if (b[y] > a[x])
		  {
		  m = m - 200;
		  y = y + 1;
		  p = p - 1;
		  }
		  else if (b[y] < a[x])
		  {
		  m = m + 200;
		  x = x + 1;
		  y = y + 1;
		  }
		  else if (b[q] < a[p])
		  {
		  p = p - 1;
		  q = q - 1;
		  m = m + 200;
		  }
		  else if (b[q] > a[p])
		  {
		  y = y + 1;
		  p = p - 1;
		  m = m - 200;
		  }
		  else if (b[y] == a[p])
		  {
		  y = y + 1;
		  p = p - 1;
		  }
		  else if (b[y] > a[p])
		  {
		  m = m - 200;
		  y = y + 1;
		  p = p - 1;
		  }
		  }
		  System.out.printf("%d\n",m);
		  }
	}
}

