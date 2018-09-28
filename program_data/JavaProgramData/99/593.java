package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		double per1 = 0;
		double per2 = 0;
		double per3 = 0;
		double per4 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
		}
		for (i = 0;i < n;i++)
		{

	if (a[i] > 0 && a[i] < 19)
	{


	b++;
	}

	if (a[i] > 18 && a[i] < 36)
	{


	c++;
	}

	if (a[i] > 35 && a[i] < 61)
	{


	d++;
	}

	if (a[i] > 60)
	{


	e++;
	}
		}
		per1 = (double)b / n * 100;
		per2 = (double)c / n * 100;
		per3 = (double)d / n * 100;
		per4 = (double)e / n * 100;
		System.out.printf("1-18: %.2lf%\n",per1);
		System.out.printf("19-35: %.2lf%\n",per2);
		System.out.printf("36-60: %.2lf%\n",per3);
		System.out.printf("60??: %.2lf%\n",per4);
		return 0;
	}

}

