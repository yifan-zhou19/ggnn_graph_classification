package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] time = new int[1000];
		int num = 0;
		int i = 0;
		int j = 0;
		char s;
		while (true)
		{
			x[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = System.in.read();
			if (s == '\n')
			{
				break;
			}
		}
		num = i;
		i = 0;
		while (true)
		{
			y[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = System.in.read();
			if (s == '\n')
			{
				break;
			}
		}
		System.out.print(num);
		System.out.print(" ");
		for (i = 0;i < num;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				time[j]++;
			}
		}
		int max = 0;
		for (i = 0;i < 1000;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.print(max);
		return 0;
	}
}

