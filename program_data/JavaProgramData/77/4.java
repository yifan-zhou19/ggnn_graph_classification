package <missing>;

public class GlobalMembers
{
	public static int[] stack = new int[100];
	public static int top = -1;


	public static int pop()
	{
		top--;
		return stack[top + 1];
	}
	public static void push(int e)
	{
		top++;
		stack[top] = e;
	}


	public static int Main()
	{
		String s = new String(new char[100]);
		int i;
		char nan;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		nan = s.charAt(0);
		push(0);
		for (i = 1;s.charAt(i);i++)
		{
			if (s.charAt(i) == nan)
			{
				push(i);
			}
			else
			{
				System.out.printf("%d %d\n",pop(),i);
			}
		}

		return 0;
	}
}

