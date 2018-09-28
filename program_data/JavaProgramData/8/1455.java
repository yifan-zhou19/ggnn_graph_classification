package <missing>;

public class GlobalMembers
{
	public static void read()
	{
		one = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		two = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < one;i++)
	{
	first[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (int i = 0;i < two;i++)
	{
	second[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	public static void sort()
	{
		for (int i = 0;i < one;i++)
		{
			for (int j = 0;j < one - i - 1;j++)
			{
				if (first[j] > first[j + 1])
				{
					swap(first[j],first[j + 1]);
				}
			}
		}
		for (int i = 0;i < two;i++)
		{
			for (int j = 0;j < two - i - 1;j++)
			{
				if (second[j] > second[j + 1])
				{
					swap(second[j],second[j + 1]);
				}
			}
		}
	}
	public static void connect()
	{
		for (int i = 0;i < two;i++)
		{
			first[one + i] = second[i];
		}
	}
	public static void output()
	{
		System.out.print(first[0]);
		for (int i = 1;i < one + two;i++)
		{
			System.out.print(' ');
			System.out.print(first[i]);
		}
	}
	public static int one;
	public static int two;
	public static int[] first = new int[100];
	public static int[] second = new int[100];
	public static int Main()
	{
		read();
		sort();
		connect();
		output();
		return 0;
	}
}

