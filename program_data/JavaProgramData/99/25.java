package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		double[] b = new double[4];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] < 19)
			{
				b[0]++;
			}
			else if (a[i] < 36)
			{
				b[1]++;
			}
			else if (a[i] < 61)
			{
				b[2]++;
			}
			else
			{
				b[3]++;
			}
		}
		System.out.printf("1-18: %.2lf%\n",b[0] / n * 100);
		System.out.printf("19-35: %.2lf%\n",b[1] / n * 100);
		System.out.printf("36-60: %.2lf%\n",b[2] / n * 100);
		System.out.printf("60??: %.2lf%\n",b[3] / n * 100);
	}


}

