package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a = 1.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		   a = a * 2;
		}
		System.out.printf("%.0lf",a);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

