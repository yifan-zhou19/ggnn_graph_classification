package <missing>;

public class GlobalMembers
{
	public static int fkong(int m,int n)
	{
	  int f = new int(int x,int y);
	  if (n == 1)
	  {
		return 0;
	  }
	  else
	  {
		return f(m, n - 1);
	  }
	}
	public static int ffei(int m,int n)
	{
	  int f = new int(int a,int b);
	  if (n == 1 || m == n)
	  {
		return 1;
	  }
	  else if (m < n)
	  {
		return 0;
	  }
	  else
	  {
	  return f(m - n, n);
	  }
	}
	public static int f(int m,int n)
	{
	  if (n == 1 || m == 1)
	  {
		return 1;
	  }
	  else
	  {
		return fkong(m, n) + ffei(m, n);
	  }
	}
	public static int Main()
	{
	  int[] m = new int[22];
	  int[] n = new int[22];
	  int i;
	  int t;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < t;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n[i] = Integer.parseInt(tempVar3);
		}
		  System.out.printf("%d\n",f(m[i], n[i]));
	  }
	}





}

