package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int a = 0;
	int s = 0;
	int d = 0;
	int f = 0;
	int g = 0;
	int h = 0;
	a = n / 100;
	s = n % 100 / 50;
	d = n % 50 / 20;
	f = (n % 100 - s * 50 - d * 20) / 10;
	g = n % 10 / 5;
	h = n % 5;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,s,d,f,g,h);
	return 0;
	}
}

