package <missing>;

public class GlobalMembers
{
	public static int f(int m)
	{
	  int n = m % 10;
	  do
	  {
		m = m / 10;
		n = 10 * n + m % 10;
	  } while (m / 10 != 0);
	  return (n);
	}
	  public static void Main()
	  {
	  int m;
	  int k;
	  int i;
	  int p;
	  int q;
	  int n;
	  int b;
	  int a = 0;
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
	  for (m = p;m <= q;m++)
	  {
		k = Math.sqrt(m);
		for (i = 2;i <= k;i++)
		{
		 if (m % i == 0)
		 {
			 break;
		 }
		}
		if (i >= k + 1)
		{
		  n = f(m);
		  if (n == m)
		  {
			  System.out.printf("%d",m);
			  break;
		  }
		}
	  }
	  for (b = m + 1;b <= q;b++)
	  {
		k = Math.sqrt(b);
		for (i = 2;i <= k;i++)
		{
		 if (b % i == 0)
		 {
			 break;
		 }
		}
		if (i >= k + 1)
		{
		  n = f(b);
		  if (n == b)
		  {
			  System.out.printf(",%d",b);
		  }
		}
	  }
	  for (m = p;m <= q;m++)
	  {
		k = Math.sqrt(m);
		for (i = 2;i <= k;i++)
		{
		 if (m % i == 0)
		 {
			 break;
		 }
		}
		if (i >= k + 1)
		{
		  n = f(m);
		  if (n == m)
		  {
			  a++;
		  }
		}
	  }
	  if (a == 0)
	  {
		  System.out.print("no");
	  }
	  }
}

