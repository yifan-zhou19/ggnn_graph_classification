package <missing>;

public class GlobalMembers
{
	public static int f = 0;
	public static int y = 0;
	public static void Main()
	{
		void f1(int a);
		int m;
		int n;
		int k;
		int p;
		int i;
		int l;
		int t = 1;
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
	for (p = m;p <= n;p++)
	{
		 k = Math.sqrt(p);
		 l = 1;
	   for (i = 2;i <= k;i++)
	   {
		 if (p % i == 0)
		 {
			 l = 0;
		 }
	   }
	   if (l == 1)
	   {
		   f1(p);
		   t++;
	   }
	}
	if (y == 0)
	{
		System.out.print("no");
	}
	}
	 public static void f1(int a)
	 {
		int[] b = new int[32];
		int k = 0;
		int x;
		int i;
		int j;
	 x = Math.log10(a);
	 j = a;
	 for (i = 0;i <= x;i++)
	 {
		b[i] = a % 10;
		a = (a - b[i]) / 10;
		k = k * 10 + b[i];
	 }
	 if ((k == j) && (f == 1))
	 {
		 System.out.printf(",%d",j);
		 y++;
	 }
	 if ((k == j) && (f == 0))
	 {
		 System.out.printf("%d",j);
		 f = 1;
		 y++;
	 }
	 }
}

