package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] num = new int[301];
		int maxnum = 0;
		int minnum = 0;
		double sub;
		double sum = 0;
		double average;
		double max = 0;
		double min = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		average = sum / n;
		for (i = 1; i <= n; i++)
		{
			sub = num[i] - average;
			if (sub > max)
			{
				max = sub;
				maxnum = i;
			}
			if (sub < min)
			{
				min = sub;
				minnum = i;
			}
		}
		min *= -1;
		if (max == min)
		{
			System.out.print(num[minnum]);
			System.out.print(",");
			System.out.print(num[maxnum]);
			System.out.print("\n");
		}
		if (max < min)
		{
			System.out.print(num[minnum]);
			System.out.print("\n");
		}
		if (max > min)
		{
			System.out.print(num[maxnum]);
			System.out.print("\n");
		}
		return 0;
	}


}

