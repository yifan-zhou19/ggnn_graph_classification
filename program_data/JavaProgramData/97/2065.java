package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int m;
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int f;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	a = m / 100;
	b = (m % 100) / 50;
	c = ((m % 100) % 50) / 20;
	d = (((m % 100) % 50) % 20) / 10;
	e = ((((m % 100) % 50) % 20) % 10) / 5;
	f = ((((m % 100) % 50) % 20) % 10) % 5;


	 System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);


	}

}

