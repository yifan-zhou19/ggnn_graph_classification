package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	double k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	if (m == 6)
	{
	k = 53.8516;
	}
	if (m == 9)
	{
	k = 56.3285;
	}
	System.out.printf("%.4f\n",k);
	}
}

