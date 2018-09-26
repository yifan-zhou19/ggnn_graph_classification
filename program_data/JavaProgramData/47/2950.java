package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * ch;
		int ch;
		ch = a.argValue;
		a.argValue = b.argValue;
		b.argValue = ch;
	}

	public static int Main()
	{
		int n;
		int[] line = new int[150];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			line[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] p_1 = line;
		for (int i = 0; i <= ((int)n / 2) - 1; i++)
		{
			swap(p_1[i], p_1[n - i - 1]);
		}
		System.out.print((p_1));
		for (int j = 1; j < n; j++)
		{
			System.out.print(' ');
			System.out.print((p_1 + j));
		}
		return 0;
	}
}

