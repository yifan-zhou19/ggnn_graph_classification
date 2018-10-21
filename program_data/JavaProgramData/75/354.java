package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count;
		int i = 0;
		int j;
		int[][] a = new int[1000][2];
		int max = 0;
		char ch;
		double temp;
		while (true)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if ((ch = System.in.read()) == '\n')
			{
				break;
			}
		}
		i = 0;
		while (true)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if ((ch = System.in.read()) == '\n')
			{
				break;
			}
		}
		for (temp = 0.5; temp < 1000; temp++)
		{
			count = 0;
			for (j = 0; j < i; j++)
			{
				if (temp > a[j][0] && temp < a[j][1])
				{
					count++;
				}
			}
			if (count > max)
			{
				max = count;
			}
		}
		System.out.print(i);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}

