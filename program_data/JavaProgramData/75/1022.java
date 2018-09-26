package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] time1 = new int[1000];
		int[] time2 = new int[1000];
		int people = 0;
		int[] num_of_time = new int[1000];
		char nouse;

		while ((time1[people] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			people++;
			if (cin.peek() == '\n')
			{
				break;
			}
			cin.ignore();
		}
		for (int k = 0;k != people-1;k++)
		{
			time2[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			nouse = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		time2[people-1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int k = 0;k != people;k++)
		{
			for (int time = time1[k];time != time2[k];time++)
			{
				num_of_time[time]++;
			}
		}
		int max = 0;
		for (int k = 0;k != 1000;k++)
		{
			if (num_of_time[k] > max)
			{
				max = num_of_time[k];
			}
		}

		System.out.print(people);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

