package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double s = 1;
	for (i = 0;i < n;i++)
	{
	s = s * 2;
	}
	System.out.printf("%.0lf",s);
	return 0;
	}
}

