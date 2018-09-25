package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	  if (n == 1 || m == 0 || m == 1)
	  {
		  return 1;
	  }
	  else if (m < n)
	  {
		  return f(m, m);
	  }
	  else
	  {
		  return f(m, n - 1) + f(m - n, n);
	  }
	}
	public static int Main()
	{
	  int i;
	  int n;
	  int a;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",f(a, b));
	  }
	  return 0;
	}
}

