package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] people = new int[1000][2];
		int sum = 1;
		int[] time = new int[1000];
		people[0][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", people[sum++][0]))
		{
			;
		}
		people[0][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 1;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", people[sum++][1]))
		{
			;
		}

		for (int i = 0;i < sum;i++)
		{
			for (int j = people[i][0];j < people[i][1];j++)
			{
				time[j]++;
			}
		}
		int max = 0;
		for (int i = 0;i < 1000;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.print(sum - 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
	}
}

