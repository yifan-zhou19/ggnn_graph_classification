package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[310];
		int i;
		int temp;
		double[] b = new double[310];
		double max = -100;
		double ave;
		double s = 0;
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
			s = s + a[i];
		}
		ave = s / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(ave - a[i]);
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(b[i] - max) < 0.0001)
			{
				System.out.printf("%d",a[i]);
				temp = i;
				break;
			}
		}
		for (i = temp + 1;i < n;i++)
		{
			if (b[i] == max)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}


}

