package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		char comma;
		int i;
		int j;
		for (i = 1;;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			comma = System.in.read();
			if (comma == ',')
			{
				continue;
			}
			if (comma == '\n')
			{
				break;
			}
		}
		for (i = 1;;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			comma = System.in.read();
			if (comma == ',')
			{
				continue;
			}
			if (comma == '\n')
			{
				break;
			}
		}
		int num = i;
		int[] time = new int[1001];
		for (i = 1; i <= num; i++)
		{
			for (j = x[i]; j < y[i]; j++)
			{
				time[j]++;
			}
		}
		int max = time[1];
		for (i = 1; i <= 1000; i++)
		{
			if (max < time[i])
			{
				max = time[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

