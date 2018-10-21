package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[300];
		int i;
		int n;
		float max;
		float min;
		float aver;
		float sum = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		max = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		min = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		aver = sum / n;
		if ((max + min) / 2 == aver)
		{
			System.out.print(min);
			System.out.print(",");
			System.out.print(max);
		}
		if ((max - aver) > (aver - min))
		{
			System.out.print(max);
		}
		if ((max - aver) < (aver - min))
		{
			System.out.print(min);
		}
		return 0;
	}
}

