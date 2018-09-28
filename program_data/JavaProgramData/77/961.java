package <missing>;

public class GlobalMembers
{
	/*bss*/
	public static int[] stack = new int[MAX];
	public static int lstack;
	public static int len;

	public static int Main()
	{
		char c;
		char a = 0;
		char b = 0;
		int i;
		int j;
		int k;
		while (c = System.in.read())
		{
			if (a == null)
			{
				a = c;
			}
			else if (c != a && !b)
			{
				b = c;
			}
			if (c == a)
			{
				stack[lstack++] = len++;
			}
			else if (c == b)
			{
				System.out.printf("%d %d\n", stack[--lstack], len++);
			}
			else
			{
				return 0;
			}
		}
	}

}
