package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	e = x / 10000;
	d = (x - e * 10000) / 1000;
	c = (x - e * 10000 - d * 1000) / 100;
	b = (x - e * 10000 - d * 1000 - c * 100) / 10;
	a = x - e * 10000 - d * 1000 - c * 100 - b * 10;
	if (x < 10)
	{
	System.out.printf("%d",a);
	}
	else if (x < 100)
	{
	System.out.printf("%02d",10 * a + b);
	}
	else if (x < 1000)
	{
	System.out.printf("%03d",100 * a + 10 * b + c);
	}
	 else if (x < 10000)
	 {
	 System.out.printf("%04d",1000 * a + 100 * b + 10 * c + d);
	 }
	else if (x == 10000)
	{
	System.out.print("00001");
	}
	return 0;
	}
}

