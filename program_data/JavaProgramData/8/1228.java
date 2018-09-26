package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] a1 = new int[10000];
	public static int[] a2 = new int[10000];
	public static int[] a3 = new int[20000];

	public static void input()
	{
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n1; i++)
		{
			a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n2; i++)
		{
			a2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void sort()
	{
		for (int i = 0; i < n1 - 1; i++)
		{
			for (int j = 0; j < n1 - i - 1; j++)
			{
				if (a1[j] > a1[j + 1])
				{
					int temp = a1[j + 1];
					a1[j + 1] = a1[j];
					a1[j] = temp;
				}
			}
		}

		for (int i = 0; i < n2 - 1; i++)
		{
			for (int j = 0; j < n2 - i - 1; j++)
			{
				if (a2[j] > a2[j + 1])
				{
					int temp = a2[j + 1];
					a2[j + 1] = a2[j];
					a2[j] = temp;
				}
			}
		}
	}

	public static void joint()
	{
		for (int i = 0; i < n1; i++)
		{
			a3[i] = a1[i];
		}
		for (int i = 0; i < n2; i++)
		{
			a3[n1 + i] = a2[i];
		}
	}

	public static void display()
	{
		System.out.print(a3[0]);
		for (int i = 1; i < n1 + n2; i++)
		{
			System.out.print(' ');
			System.out.print(a3[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		input();
		sort();
		joint();
		display();
		return 0;
	}


}

