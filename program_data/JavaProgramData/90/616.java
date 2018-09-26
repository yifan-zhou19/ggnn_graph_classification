package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n, tangible.RefObject<Integer> k)
	{
		if (m == 0)
		{
			k.argValue = k.argValue+1;
			return;
		}
		if (n == 1)
		{
			k.argValue = k.argValue+1;
			return;
		}
		if (m - n >= 0)
		{
			f(m - n, n, k);
		}
		f(m, n - 1, k);
	}
	public static int Main()
	{
		int g;
		int i;
		int j;
		int[] m;
		int[] n;
		int[] k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  g = Integer.parseInt(tempVar);
	  }
	  m = new int[g];
	  n = new int[g];
	  k = new int[g];
	  for (i = 0;i < g;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m + i = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   n + i = tempVar3;
	   }
	  }
	  for (i = 0;i < g;i++)
	  {
		  k[i] = 0;
		f(m[i], n[i], k + i);
		System.out.printf("%d",k[i]);
		if (i != g - 1)
		{
			System.out.print("\n");
		}
	  }
	}
}

