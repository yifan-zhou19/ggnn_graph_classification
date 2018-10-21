package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		f = Math.pow(2.0,(double)n);
		System.out.printf("%.0lf",f);
		return 0;
	}
}

