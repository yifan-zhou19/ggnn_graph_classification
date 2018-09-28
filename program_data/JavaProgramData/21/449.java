package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] x = new int[300];
		int max;
		int min;
		int s = 0;
		float aver;
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
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			s = s + x[i];
		}
		aver = s * 1.0 / n;
		max = x[0];
		min = x[0];
		for (i = 1;i < n;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
			else if (x[i] < min)
			{
				min = x[i];
			}
		}
		if (max == min)
		{
			System.out.printf("%d",min);
		}
		else if ((max - aver) > (aver - min))
		{
			System.out.printf("%d",max);
		}
		else if ((max - aver) < (aver - min))
		{
			System.out.printf("%d",min);
		}
		else
		{
			System.out.printf("%d,%d",min,max);
		}
	}
}

