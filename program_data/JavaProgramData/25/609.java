package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	a = Math.pow(2.0,n);
	System.out.printf("%.0lf",a);
	return 0;
	}

}

