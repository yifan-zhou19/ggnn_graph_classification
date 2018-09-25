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
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
		 if (a > 9999)
		 {
	System.out.print("00001");
		 }
		 else if (a > 999)
		 {
		b = a / 1000;
	c = (a - b * 1000) / 100;
	d = (a - b * 1000 - c * 100) / 10;
	e = (a - b * 1000 - c * 100 - d * 10);
	System.out.printf("%d%d%d%d",e,d,c,b);
		 }
		 else if (a > 99)
		 {
		b = a / 100;
	c = (a - b * 100) / 10;
	d = (a - b * 100 - c * 10);
	System.out.printf("%d%d%d",d,c,b);
		 }
		 else if (a > 9)
		 {
		b = a / 10;
	c = (a - b * 10);
	System.out.printf("%d%d",c,b);
		 }
		 else
		 {
	System.out.printf("%d",a);
		 }
	return 0;
	}
}

