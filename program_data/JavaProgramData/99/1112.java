package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	double a;
	double b;
	double c;
	double d;
	 a = 0;
	b = 0;
	c = 0;
	d = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 m = n;
	 int[] age = new int[m];
	 int i;
	 for (i = 0;i < m;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 age[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 for (i = 0;i < m;i++)
	 {
	 if (age[i] <= 18)
	 {
	  a = a + 1;
	 }
	else if (age[i] <= 35)
	{
	  b = b + 1;
	}
	else if (age[i] <= 60)
	{
	  c = c + 1;
	}
	else
	{
	  d = d + 1;
	}
	 }
	a = 100 * a / m;
	b = 100 * b / m;
	c = 100 * c / m;
	d = 100 * d / m;
	System.out.printf("1-18: %.2lf",a);
	System.out.print("%%\n");
	System.out.printf("19-35: %.2lf",b);
	System.out.print("%%\n");
	System.out.printf("36-60: %.2lf",c);
	System.out.print("%%\n");
	System.out.printf("Over60: %.2lf",d);
	System.out.print("%%\n");
	 return 0;
	}




}

