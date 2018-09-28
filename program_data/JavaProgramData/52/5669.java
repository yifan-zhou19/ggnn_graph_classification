package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c=a;
		int c = a.argValue;
		a.argValue = b.argValue;
		b.argValue = c;

	}

	public static void backward(tangible.RefObject<Integer> pointer, int n)
	{
		for (int i = n - 1; i > 0; i--)
		{
			swap(*(pointer.argValue + i), *(pointer.argValue + i - 1));
		}
	}

	public static int Main()
	{
		int n;
		int time;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] line = new int[120];
		for (int i = 0; i < n; i++)
		{
			line[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] p_1 = line;
		for (int i = 1; i <= time; i++)
		{
		tangible.RefObject<Integer> tempRef_p_1 = new tangible.RefObject<Integer>(p_1);
			backward(tempRef_p_1, n);
			p_1 = tempRef_p_1.argValue;
		}
		System.out.print(p_1);
		for (int i = 1; i < n; i++)
		{
			System.out.print(' ');
			System.out.print((p_1 + i));
		}
	}

}

