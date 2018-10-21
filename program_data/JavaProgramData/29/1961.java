package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static double a;
	public static double f(int t)
	{
		int b = 1;
		int c = 2;
		int p;
		int i;
	 a = 0;
	 for (i = 1;i <= t;i++)
	 {
		 a += (double)c / (double)b;
	  p = b + c;
	  b = c;
	  c = p;
	 }
	 return a;
	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
	 for (i = 1;i <= m;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
	  System.out.printf("%.3f\n",f(n));
	 }
	}

}

