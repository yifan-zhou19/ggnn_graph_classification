package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] stack = new int[100];
		int top = 0;
		int count = 0;
		char boy;
		char c;
		boy = ConsoleInput.readToWhiteSpace(true).charAt(0);
		stack[top++] = count++;
		while ((c = System.in.read()) != '\n')
		{
			if (c == boy)
			{
				stack[top++] = count++;
			}
			else
			{
				System.out.printf("%d %d\n", stack[--top], count++);
			}
		}

		return 0;
	}
}

