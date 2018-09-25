package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int f = new int(int x,int y);
	  int g = int y;
	  int[] a = new int[200];
	  int k = 0;
	  int t;
	  int m;
	  int n;
	  int p1;
	  int p2;
	  int p3;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (t = m;t <= n;t++)
	  {
		p3 = Math.sqrt(t);
		p1 = f(t, p3);
		p2 = g(t);
		if (p1 == 1 && p2 == 1)
		{
		  a[k] = t;
		  k++;
		}
	  }
	   if (k == 0)
	   {
	   System.out.print("no");
	   }
	   else if (k > 0)
	   {
	   for (i = 0;i < k;i++)
	   {
		 if (i == k - 1)
		 {
		 System.out.printf("%d",a[i]);
		 }
		else
		{
			System.out.printf("%d,",a[i]);
		}
	   }
	   }

	}
	  public static int f(int x,int y)
	  {
	  int a = 0;
	  int i;

	  for (i = 2;i <= y;i++)
	  {
	  if (x % i == 0)
	  {
	  break;
	  }
	  }
	  if (i >= y + 1)
	  {
	  a = 1;
	  }
	  return (a);
	  }
	  public static int g(int y)
	  {
	   int b;
	   int i;
	   int j;
	   int k = 0;
	   int e;
	   int f = 0;
	   j = y;
	   while (y >= 10)
	   {
		 y = y / 10;
		 k++;
	   }
		y = j;
	   for (i = 0;i <= k;i++)
	   {
		 e = y % 10;
		 y = y / 10;
		 f = f * 10 + e;
	   }
	   if (f == j)
	   {
	   b = 1;
	   }
	  else
	  {
		  b = 0;
	  }
	  return (b);
	  }
}

