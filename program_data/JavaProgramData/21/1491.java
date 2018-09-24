package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float min;
		float max;
		float[] a = new float[300];
		float sum;
		float aver;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Float.parseFloat(tempVar2);
		}
		min = max = sum = a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Float.parseFloat(tempVar3);
			}
			sum = sum + a[i];
			if (max < a[i])
			{
				max = a[i];
			}
			else if (min > a[i])
			{
				min = a[i];
			}
		}
		aver = sum / n;
		if (max - aver > aver - min)
		{
			System.out.printf("%.0f",max);
		}
		else if (max - aver < aver - min)
		{
			System.out.printf("%.0f",min);
		}
		else
		{
			System.out.printf("%.0f,%.0f",min,max);
		}
		return 0;
	}
}

