package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 a = (int)n / 100;
	 a1 = n - a * 100;
	b = (int)a1 / 50;
	b1 = a1 - b * 50;
	c = (int)b1 / 20;
	c1 = b1 - c * 20;
	d = (int)c1 / 10;
	d1 = c1 - d * 10;
	e = (int)d1 / 5;
	e1 = d1 - e * 5;
	f = (int)e1 / 1;

	System.out.printf("%d\n",a);
	System.out.printf("%d\n",b);
	System.out.printf("%d\n",c);
	System.out.printf("%d\n",d);
	System.out.printf("%d\n",e);
	System.out.printf("%d\n",f);
	}


}

