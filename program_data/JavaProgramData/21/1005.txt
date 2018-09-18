package <missing>;

public class GlobalMembers
{
	public static final double MIN = 0.000001;
	public static int Main()
	{
		int n;
		int[] number = new int[301];
		int[] result = new int[301];
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
		result[0] = -1;
		double x;
		double y = -1;
		for (i = 0;i < n;i++)
		{
			x = number[i] - average;
			if (x < 0)
			{
				x = -x;
			}
			if (y < x)
			{
				y = x;
			}
		}
		//cout<<average<<endl<<y<<endl;
		t = 0;
		for (i = 0;i < n;i++)
		{
			if ((number[i] - average - y < MIN && number[i] - average - y>-MIN) || (number[i] - average + y < MIN && number[i] - average + y>-MIN))
			{
				if (number[i] != result[t])
				{
					result[t++] = number[i];
				}
			}
		}

		for (i = 0;i < t;i++)
		{
			System.out.print(result[i]);
			if (i < t - 1)
			{
				System.out.print(",");
			}
		}
		return 0;
	}
}

