package <missing>;

public class GlobalMembers
{
	public static final double MIN = 0.000001;
	public static int Main()
	{
		int n;
		int[] number = new int[301];
		int i;
		int j;
		int t;
		double sum = 0;
		double average;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += number[i];
		}
		average = sum / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (number[i] > number[j])
				{
					t = number[i];
					number[i] = number[j];
					number[j] = t;
				}
			}
		}
		if (average - number[0] == number[n - 1] - average)
		{
			System.out.print(number[0]);
			System.out.print(",");
			System.out.print(number[n - 1]);
			System.out.print("\n");
		}
		else if (average - number[0] > number[n - 1] - average)
		{
			System.out.print(number[0]);
			System.out.print("\n");
		}
		else if (average - number[0] < number[n - 1] - average)
		{
			System.out.print(number[n - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

