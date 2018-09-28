package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[1000];
	  int[] b = new int[1000];
	  int[] m = new int[1000];
	  int c = 0;
	  int i;
	  int j;
	  int t;
	  int x;
	  int y;
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
	  x = 0;
	  y = 0;
	  m[c] = -n;
	  for (i = 0;i <= n - 1;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  }
	  for (j = 0;j < n - 1;j++)
	  {
	  for (i = 0;i < n - j - 1;i++)
	  {
		 if (a[i] < a[i + 1])
		 {
		 t = a[i];
		a[i] = a[i + 1];
		a[i + 1] = t;
		 }
		 if (b[i] < b[i + 1])
		 {
			 t = b[i];
		   b[i] = b[i + 1];
		   b[i + 1] = t;
		 }
	  }
	  }
	for (j = 0;j <= n - 1;j++)
	{
		for (i = 0;i <= n - 1;i++)
		{
		  if (i + j <= n - 1)
		  {
		  if (a[i] > b[i + j])
		  {
			 x++;
		  }
	   if (a[i] < b[i + j])
	   {
			 y++;
	   }
		  }
		 if (i + j >= n)
		 {
			 if (a[i] > b[i + j - n])
			 {
			 x++;
			 }
		   if (a[i] < b[i + j - n])
		   {
			 y++;
		   }
		 }
		}
	   if (x - y > m[c])
	   {
		m[c] = x - y;
	   }
		 x = 0;
		 y = 0;
	}
	  c++;
	  }
	   for (i = 0;i <= c - 1;i++)
	   {
	   System.out.printf("%d\n",200 * m[i]);
	   }
	}
}

