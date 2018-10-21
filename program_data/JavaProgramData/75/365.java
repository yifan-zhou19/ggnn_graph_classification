package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char temp = 0;
		int[] time = new int[1000];
		int[][] t = new int[2][1000];
		int num = 0;
		int i = 0;
		int j = 0;
		int max = 0;
		for (i = 0; i < 2; i++, temp = 0)
		{
			for (j = 0; temp != '\n'; j++)
			{
				t[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				temp = System.in.read();
			}
		}
		num = j;
		for (i = 0; i < num; i++)
		{
			for (j = t[0][i]; j < t[1][i]; j++)
			{
				time[j]++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

