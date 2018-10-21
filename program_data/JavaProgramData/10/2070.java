package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];
	public static int Main()
	{
		int d = new int(int xz,int p,int q);
		int y;
		int i;
		int n;
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		}
		y = d(10000, 1, n);
		System.out.printf("%d",y);
	}
	public static int d(int xz,int p,int q)
	{
		int g;
		int h;
		if (p == q && a[p] <= xz)
		{
			return 1;
		}
		else if (p == q && a[p] > xz)
		{
			return 0;
		}
		else
		{
			 if (xz < a[p])
			 {
				 return (d(xz, p + 1, q));
			 }
			 else
			 {
			 g = 1 + d(a[p], p + 1, q);
			 h = d(xz, p + 1, q);
			 if (g > h)
			 {
				 return (g);
			 }
			 else
			 {
				 return (h);
			 }
			 }
		}
	}

}

