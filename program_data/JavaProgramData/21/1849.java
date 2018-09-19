package <missing>;

public class GlobalMembers
{
	public static float k(float i)
	{
		if (i >= 0F)
		{
			return i;
		}
		else
		{
			return -i;
		}
	}
	public static void Main()
	{
		int n;
		int[] a = new int[400];
		int s = 0;
		int max = 0;
		int min;
		int count = 0;
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			s = s + a[i];
		}
		aver = ((float)s) / n;
		for (i = 0,min = a[0];i < n;i++)
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
		if (((float)max - aver) > (-(float)min + aver))
		{
			System.out.printf("%d",max);
		}
		if (((float)max - aver) < (-(float)min + aver))
		{
			System.out.printf("%d",min);
		}
		if (((float)max - aver) == (-(float)min + aver))
		{
			System.out.printf("%d,%d",min,max);
		}
	}
}

