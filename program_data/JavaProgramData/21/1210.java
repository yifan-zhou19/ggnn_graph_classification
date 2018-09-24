package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num_min = 1;
		int num_max = 1;
		float max = -10000F;
		float min = 10000F;
		float[] a = new float[301];
		float sum = 0F;
		float ave;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (a[i] > max)
			{
				max = a[i];
				num_max = 1;
			}
			else if (a[i] == max)
			{
				num_max++;
			}
			if (min > a[i])
			{
				min = a[i];
				num_min = 1;
			}
			else if (min == a[i])
			{
				num_min++;
			}
			sum += a[i];
		}
		ave = sum / n;
		if (ave == (max + min) / 2)
		{
			for (int t = 1;t <= num_min;t++)
			{
				System.out.print(min);
				System.out.print(",");
			}
			for (int t = 1;t < num_max;t++)
			{
				System.out.print(max);
				System.out.print(",");
			}
			System.out.print(max);
		}
		else if (ave < (max + min) / 2)
		{
			for (int t = 1;t < num_max;t++)
			{
				System.out.print(max);
				System.out.print(",");
			}
			System.out.print(max);
		}
		else if (ave > (max + min) / 2)
		{
			for (int t = 1;t < num_min;t++)
			{
				System.out.print(min);
				System.out.print(",");
			}
			System.out.print(min);
		}

		return 0;
	}
}

