package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
	  int i;
	  int m;
	  double k;
	  k = Math.sqrt(x);
	  for (i = 2;i <= k;i++)
	  {
		  if (x % i == 0)
		  {
	  break;
		  }
	  }
	  if (i > k)
	  {
		  m = 1;
	  }
	  else
	  {
		  m = 0;
	  }
	  return m;
	}
	public static int round(int y)
	{
	  int[] a = new int[10000];
	  int j;
	  int n;
	  int l;
	  int sum = 0;
	  int c;
	  for (j = 0;y != 0;j++)
	  {
		  a[j] = y % 10;
	  y = y / 10;
	  }
	  for (l = 0;l < j;l++)
	  {
		  if (a[l] != a[j - 1 - l])
		  {
	   break;
		  }
	  }
	   if (l == j)
	   {
		   n = 1;
	   }
	  else
	  {
		  n = 0;
	  }
	  return n;
	}
	public static int Main()
	{
		int p;
		int q;
		int s;
		int count = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  q = Integer.parseInt(tempVar2);
	  }
	  for (s = p;s <= q;s++)
	  {
		  if (prime(s) == 1 && round(s) == 1)
		  {
		   count++;
	   if (count == 1)
	   {
	   System.out.printf("%d",s);
	   }
	   else if (count != 1)
	   {
	   System.out.printf(",%d",s);
	   }
		  }
	  }
	  if (count == 0)
	  {
	  System.out.print("no\n");
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}

