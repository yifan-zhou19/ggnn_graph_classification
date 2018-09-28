package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] hour = new int[101];
		int high;
		int low;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 1;
		for (int i = 0; i < n; i++)
		{
			high = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (high >= 90 && high <= 140 && low >= 60 && low <= 90)
			{
				hour[num]++;
			}
			else
			{
				num++;
			}
		}
		int max = 0;
		for (int i = 1; i <= num; i++)
		{
			if (hour[i] > max)
			{
				max = hour[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

