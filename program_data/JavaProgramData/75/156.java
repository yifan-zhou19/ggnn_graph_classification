package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[1000];
	int[] b = new int[1000];
	char c;
	int i = 0;
	int max = 0;

	while (true)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((c = System.in.read()) == '\n')
		{
			break;
		}
		else
		{
			i++;
		}
	}

	int sum = i + 1;
	i = 0;
	while (true)
	{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((c = System.in.read()) == '\n')
		{
			break;
		}
		else
		{
			i++;
		}
	}



	for (i = 0;i < sum;i++)
	{
		if (max < b[i])
		{
			max = b[i];
		}
	}



	int[] time = new int[max];

	for (i = 0;i < max;i++)
	{
		time[i] = 0;
	}

	for (i = 0;i < sum;i++)
	{
		for (int j = a[i];j < b[i];j++)
		{
			time[j]++;
		}
	}
	int num = 0;

	for (i = 0;i < max;i++)
	{
		if (num < time[i])
		{
			num = time[i];
		}
	}

	System.out.print(sum);
	System.out.print(' ');
	System.out.print(num);
	System.out.print("\n");

	return 0;
	}
}

