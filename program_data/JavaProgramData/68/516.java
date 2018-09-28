package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int k;
		int e;
		int f;
		k = 6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (k <= n)
		{
		 for (a = 3;a <= k != 0 && k - a>1;a = a + 2)
		 {
			 b = k - a;
			 e = Math.sqrt(a);
			 f = Math.sqrt(b);
		 for (c = 3;c <= e != 0 || c <= f;c = c + 2)
		 {
			 if ((a % c == 0 && a / c > 1) || (b % c == 0 && b / c > 1))
			 {
			 break;
			 }
		 }
		  if (c > e && c > f)
		  {
			  System.out.printf("%d=%d+%d\n",k,a,b);
		  break;
		  }
		 }
	 k = k + 2;
		}
		return 0;
	}
}

