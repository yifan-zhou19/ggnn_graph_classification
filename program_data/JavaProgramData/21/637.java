package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int[] num = new int[300];
		int flag = 0;
		double temp;
		double average;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		average = (double) sum / n;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (num[j] > num[j + 1])
				{
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		temp = Math.abs(average - num[0]);
		for (i = 1; i < n; i++)
		{
			if (temp < Math.abs(average - num[i]))
			{
				temp = Math.abs(average - num[i]);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs((Math.abs(num[i] - average) - temp)) < 1e-5)
			{
				if (flag == 0)
				{
					System.out.print(num[i]);
					flag = 1;
				}
				else
				{
					System.out.print(",");
					System.out.print(num[i]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

