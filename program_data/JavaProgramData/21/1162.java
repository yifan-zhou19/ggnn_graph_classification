package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int n;
		int max;
		int min;
		double aver;
		double cha1;
		double cha2;
		double sum = 0.0;
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
			sum = sum + a[i];
		}
		aver = sum / n;
		max = a[0];
		min = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		cha1 = Math.abs(max - aver);
		cha2 = Math.abs(min - aver);
		if (cha1 == cha2)
		{
			System.out.printf("%d,%d",min,max);
		}
		else
		{
			if (cha1 > cha2)
			{
				System.out.printf("%d",max);
			}
			else
			{
				System.out.printf("%d",min);
			}
		}
		return 0;
	}
}

