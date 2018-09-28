package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
			m = Math.pow(2,n);
			System.out.printf("%.lf",m);
		}
		return 0;
	}
}

