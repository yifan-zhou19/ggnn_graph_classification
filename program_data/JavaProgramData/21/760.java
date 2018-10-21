package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max = -99999;
		int min = -max;
		int sum = 0;
		double p;
		int[] num = new int[300];
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num[i] < min)
			{
				min = num[i];
			}
			else if (num[i] > max)
			{
				max = num[i];
			}
			sum += num[i];
		}
		p = (double)sum / n;
		if (Math.abs(max - p - p + min) < 0.000001)
		{
			System.out.print(min);
			System.out.print(',');
			System.out.print(max);
		}
		else
		{
			if (max - p > p - min)
			{
				System.out.print(max);
			}
			else
			{
				System.out.print(min);
			}
		}
		return 0;
	}


}

