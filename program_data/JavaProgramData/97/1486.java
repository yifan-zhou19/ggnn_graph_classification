package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int yb;
	int ws;
	int es;
	int sy;
	int wy;
	int yy;
	int z;
	int x;
	int w;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	yb = n / 100;
	z = n - yb * 100;
	ws = z / 50;
	y = n - yb * 100 - ws * 50;
	es = y / 20;
	x = n - yb * 100 - ws * 50 - es * 20;
	sy = x / 10;
	w = n - yb * 100 - ws * 50 - es * 20 - sy * 10;
	wy = w / 5;
	yy = w - wy * 5;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",yb,ws,es,sy,wy,yy);
	return 0;
	}
}

