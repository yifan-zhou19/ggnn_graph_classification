package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int u18;
	int u35;
	int u60;
	int up60;
	u18 = 0;
	u35 = 0;
	u60 = 0;
	up60 = 0;
	double un18;
	double un35;
	double un60;
	double upper60;
	i = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (i <= n)
	{
	int x;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	if (x <= 18)
	{
	u18++;
	i++;
	}
	else if (x > 18 && x <= 35)
	{
	u35++;
	i++;
	}
	else if (x > 35 && x <= 60)
	{
	u60++;
	i++;
	}
	else if (x > 60)
	{
	up60++;
	i++;
	}
	else
	{
	u35++;
	i++;
	}
	}
	un18 = 100.0 * u18 / n;
	un35 = 100.0 * u35 / n;
	un60 = 100.0 * u60 / n;
	upper60 = 100.0 * up60 / n;
	System.out.printf("1-18: %.2lf%%\n",un18);
	System.out.printf("19-35: %.2lf%%\n",un35);
	System.out.printf("36-60: %.2lf%%\n",un60);
	System.out.printf("60??: %.2lf%%\n",upper60);

	return 0;
	}

}

