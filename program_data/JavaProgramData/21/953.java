package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int leap = 0;
		int[] la = new int[2];
		double ave;
		double max = 0;
		double sum = 0;
		double[] cha = new double[300];
		int[] a = new int[300];
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
			sum += a[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			cha[i] = Math.abs(a[i] - ave);
			if (cha[i] > max)
			{
			max = cha[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				leap = leap + 1;
				la[t] = a[i];
				t++;
			}
		}
		if (leap == 1)
		{
		System.out.printf("%d",la[0]);
		}
		else
		{
		System.out.printf("%d,%d",la[0],la[1]);
		}
	}
}

