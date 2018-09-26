package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] time = new int[1000];
		int[] intime = new int[1000];
		int[] outtime = new int[1000];
		int i = 0;
		int j = 0;
		int peoplesum = 0;
		int maxsum = 0;
		char mark;
		do
		{
			intime[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mark = System.in.read();
			peoplesum++;
			i++;
		}while (mark != '\n');
		i = 0;
		do
		{
			outtime[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mark = System.in.read();
			i++;
		}while (mark != '\n');
		for (i = 0; i < peoplesum; i++)
		{
			for (j = intime[i]; j < outtime[i]; j++)
			{
				time[j]++;
			}
		}
		for (j = 0; j < 1000; j++)
		{
			if (time[j] > maxsum)
			{
				maxsum = time[j];
			}
		}
		System.out.print(peoplesum);
		System.out.print(" ");
		System.out.print(maxsum);
		return 0;
	}
}

