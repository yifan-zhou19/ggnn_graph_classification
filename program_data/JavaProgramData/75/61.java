package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int intime;
		int outtime;
		int[] time = new int[1000];
		int count = 0;
		char a;
		int i;
		do
		{
			intime = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count++;
			for (i = intime;i < 1000;i++)
			{
				time[i]++;
			}
			cin.get(a);
		} while (a != '\n');
		do
		{
			outtime = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (i = outtime;i < 1000;i++)
			{
				time[i]--;
			}
			cin.get(a);
		} while (a != '\n');
		int max = time[0];
		for (i = 1;i < 1000;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");


		return 0;
	}

}

