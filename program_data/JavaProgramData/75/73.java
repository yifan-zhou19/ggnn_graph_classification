package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] time = new int[2][1000];
		int n;
		int i;
		int j;
		int k;
		char[][] c = new char[2][1000];
		int max;
		int min;
		int mostpeople;
		int countpeople;
		for (i = 0; i < 2; i++)
		{
			for (j = 0; ; j++)
			{
				time[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				c[i][j] = System.in.read();
				if (c[i][j] != ',')
				{
					break;
				}
			}
		}
		n = j;
		System.out.print(n + 1);
		System.out.print(" ");
		min = time[0][0];
		for (j = 0; j <= n; j++)
		{
			if (min > time[0][j])
			{
				min = time[0][j];
			}
		}
		max = time[1][0];
		for (j = 0; j <= n; j++)
		{
			if (max < time[1][j])
			{
				max = time[1][j];
			}
		}
		mostpeople = 0;
		for (k = min; k <= max; k++)
		{
			countpeople = 0;
			for (j = 0; j <= n; j++)
			{
				if ((k >= time[0][j]) && (k < time[1][j]))
				{
					countpeople += 1;
				}
			}
			if (mostpeople < countpeople)
			{
				mostpeople = countpeople;
			}
		}
		System.out.print(mostpeople);
		return 0;
	}
}

