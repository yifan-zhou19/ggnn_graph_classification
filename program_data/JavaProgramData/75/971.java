package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] time = new int[3][1005];
		int i = 1;
		int j;
		int num;
		int tmax = 0;
		int[] count = new int[1005];
		int countmax = 0;
		char p = 0;
		while (p != '\n')
		{
			time [1][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = System.in.read();
			i++;
		}
		p = 0,i = 1;
		while (p != '\n')
		{
			time [2][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = System.in.read();
			i++;
		}
		num = i - 1;
		for (i = 1; i <= num; i++)
		{
			if (time[2][i] > tmax)
			{
				tmax = time [2][i];
			}
		}
		for (i = 1; i <= tmax; i++)
		{
			for (j = 1; j <= num; j++)
			{
				if (time [2][j] > i && time [1][j] <= i)
				{
					count[i]++;
				}
			}
		}
		for (i = 1; i <= tmax; i++)
		{
			if (count[i] > countmax)
			{
				countmax = count[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(countmax);
		System.out.print("\n");
		return 0;
	}

}

