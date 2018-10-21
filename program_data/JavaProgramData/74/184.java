package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int f = int a;
	  int g = int a;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  int i;
	  int x = 0;
	  for (i = m;i <= n;i++)
	  {
		if (f(i) == 1 && g(i) == 1)
		{
		  System.out.printf("%d",i);
		  x++;
		  break;
		}
	  }
	  for (i = i + 1;i <= n;i++)
	  {
		if (f(i) == 1 && g(i) == 1)
		{
		  System.out.printf(",%d",i);
		  x++;
		}
	  }
	  if (x == 0)
	  {
		  System.out.print("no");
	  }
	return 0;
	}
	public static int f(int a)
	{
	  int i;
	  int k;
	  int l;
	  k = Math.sqrt(a);
	  for (i = 2;i <= k;i++)
	  {
	  if (a % i == 0)
	  {
		  break;
	  }
	  }
	  if (i > k)
	  {
		  l = 1;
	  }
	  else
	  {
		  l = 0;
	  }
	  return (l);
	}
	public static int g(int a)
	{
	  int i;
	  int x = 0;
	  int j;
	  int k;
	  for (i = 0;i <= 9;i++)
	  {
		  if (a == i + 10 * i)
		  {
			  x = 1;
		  }
		  for (j = 0;j <= 9;j++)
		  {
			  if (a == i + 10 * j + 100 * i)
			  {
				  x = 1;
			  }
			  if (a == i + 10 * j + 100 * j + 1000 * i)
			  {
				  x = 1;
			  }
			  for (k = 0;k <= 9;k++)
			  {
				  if (a == i + 10 * j + 100 * k + 1000 * j + 10000 * i)
				  {
					  x = 1;
				  }
			  }
		  }
	  }
	  return (x);
	}
}

