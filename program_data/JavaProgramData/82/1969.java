package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hours;
		hours = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int maxNormHours = 0;
		int normHours = 0;
		for (int i = 1 ; i <= hours ; i++)
		{
			int max;
			int min;
			max = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			min = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((max >= 90) && (max <= 140) && (min <= 90) && (min >= 60) == 1)
			{
				normHours++;
			}
			else
			{
				if (normHours > maxNormHours)
				{
					maxNormHours = normHours;
				}
				normHours = 0;
			}
		}
		if (normHours > maxNormHours)
		{
		maxNormHours = normHours;
		}
		System.out.print(maxNormHours);
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}
}

