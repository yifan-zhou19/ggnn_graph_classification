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
	double chu1;
	double chu2;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		chu1 = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		chu2 = Double.parseDouble(tempVar3);
	}
	int i;
	double[] bi1 = new double[100];
	double[] bi2 = new double[100];
	for (i = 0;i < n - 1;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			bi1[i] = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			bi2[i] = Double.parseDouble(tempVar5);
		}
	}

	for (i = 0;i < n - 1;i++)
	{

		if (chu2 / chu1 - bi2[i] / bi1[i] > 0.05)
		{

			System.out.print("worse\n");
		}
		else if (bi2[i] / bi1[i] - chu2 / chu1 > 0.05)
		{
			System.out.print("better\n");
		}
		else
		{
			System.out.print("same\n");
		}
	}
	return 0;
	}

}

