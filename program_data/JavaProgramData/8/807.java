package <missing>;

public class GlobalMembers
{
	/*
	 *????task.cpp
	 *??????
	 *?????2012-11-22
	 *??????????
	 */



	public static int n1;
	public static int n2;
	public static int[] num1 = new int[10001];
	public static int[] num2 = new int[10001];

	public static void init() // ????????
	{
		int i;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n1;i++)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n2;i++)
		{
			num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void sort() // ??
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n1 - 1;i++) // ?num1????
		{
			for (j = 0;j < n1 - i - 1;j++)
			{
				if (num1[j] > num1[j + 1])
				{
					t = num1[j];
					num1[j] = num1[j + 1];
					num1[j + 1] = t; // ??
				}
			}
		}
		for (i = 0;i < n2 - 1;i++) // ?num2????
		{
			for (j = 0;j < n2 - i - 1;j++)
			{
				if (num2[j] > num2[j + 1])
				{
					t = num2[j];
					num2[j] = num2[j + 1];
					num2[j + 1] = t; // ??
				}
			}
		}
	}

	public static void merge() // ??
	{
		int i;
		int j;
		for (i = n1,j = 0;j < n2;i++,j++)
		{
			num1[i] = num2[j]; // ?num2??num1??
		}
		n1 += n2;
	}

	public static void show() // ????????
	{
		int i;
		System.out.print(num1[0]);
		for (i = 1;i < n1;i++)
		{
			System.out.print(' ');
			System.out.print(num1[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		init(); // ????????
		sort(); // ??????????
		merge(); // ?????????
		show(); // ????????
		return 0;
	}
}

