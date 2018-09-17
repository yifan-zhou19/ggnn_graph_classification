package <missing>;

public class GlobalMembers
{
	public static int lanjie(int x, int p)
	{
		if (r[x][p] != 0)
		{
		 return r[x][p];
		}
		else if (x == n - 1)
		{
			 if (h[x] <= p)
			 {
		   return r[x][p] = 1;
			 }
		  else
		  {
		   return r[x][p] = 0;
		  }
		}
		else
		{
			 int f;
		  if (h[x] <= p)
		  {
			   f = max(1 + lanjie(x + 1, h[x]), lanjie(x + 1, p));
		  }
		  else
		  {
		   f = lanjie(x + 1, p);
		  }
		  return r[x][p] = f;
		}
	}
	public static int max(int a, int b)
	{
		return (a > b)?a:b;
	}
	public static int n;
	public static int t = 0;
	public static int[] h = new int[25];
	public static int[][] r = new int[25][10000];
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 h[i] = Integer.parseInt(tempVar2);
		 }
		}
		System.out.printf("%d",lanjie(0, 10000));
		return 0;
	}
}

