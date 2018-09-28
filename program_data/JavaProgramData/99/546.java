package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] s = new int[100];
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		int d1 = 0;
	 double a;
	 double b;
	 double c;
	 double d;
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
			 s[i] = Integer.parseInt(tempVar2);
		 }
		if (s[i] < 19)
		{
			a1++;
		}
		if (s[i] > 18 && s[i] < 36)
		{
			b1++;
		}
		if (s[i] > 35 && s[i] < 61)
		{
			c1++;
		}
		if (s[i] > 60)
		{
			d1++;
		}
	 }
	 a = (double)a1 / (double)n * 100;
	 b = (double)b1 / (double)n * 100;
	 c = (double)c1 / (double)n * 100;
	 d = (double)d1 / (double)n * 100;
	 System.out.printf("1-18: %.2lf",a);
	 System.out.print("%%\n");
	 System.out.printf("19-35: %.2lf",b);
	 System.out.print("%%\n");
	 System.out.printf("36-60: %.2lf",c);
	 System.out.print("%%\n");
	 System.out.printf("60??: %.2lf",d);
	 System.out.print("%%\n");
	}
}

