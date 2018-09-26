package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		double b1;
		double b2;
		double b3;
		double b4;
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
			if (a[i] <= 18)
			{
				count1 += 1;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				count2 += 1;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				count3 += 1;
			}
			else
			{
				count4 += 1;
			}
		}
		b1 = count1 * 100.00 / n;
		b2 = count2 * 100.00 / n;
		b3 = count3 * 100.00 / n;
		b4 = count4 * 100.00 / n;
		System.out.printf("1-18: %.2f%\n19-35: %.2f%\n36-60: %.2f%\n60??: %.2f%",b1,b2,b3,b4);
		return 0;
	}

}

