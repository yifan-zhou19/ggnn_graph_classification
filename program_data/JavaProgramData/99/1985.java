package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int j;
	int k;
	int[] A = new int[100];
	int P1 = 0;
	int P2 = 0;
	int P3 = 0;
	int P4 = 0;

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
			A[i] = Integer.parseInt(tempVar2);
		}
	}

	for (i = 0;i < n;i++)
	{
		if (A[i] <= 18)
		{
			P1++;
		}
		if ((A[i] >= 19) && (A[i] <= 35))
		{
			P2++;
		}
		if ((A[i] >= 36) && (A[i] <= 60))
		{
			P3++;
		}
		if (A[i] >= 61)
		{
			P4++;
		}
	}

	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n", (double)100 * P1 / n,(double)100 * P2 / n,(double)100 * P3 / n,(double)100 * P4 / n);

	return 0;
	}
}

