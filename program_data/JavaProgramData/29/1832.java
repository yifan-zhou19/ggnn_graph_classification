package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int fm;
	int fn;
	int i;
	int j;
	double s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i++)
	{
		s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		fm = 1;
		fn = 1;
	for (j = 1;j <= n;j++)
	{
		fm = fm + fn;
		fn = fm - fn;
		s += (1.0 * fm) / fn;
	}


	System.out.printf("%.3f\n",s);



	}

	return 0;
	}
}

