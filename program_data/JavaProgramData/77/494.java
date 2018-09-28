package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] stack = new int[5000];
		int top = 0;
		int i = 0;
		char d;
		char a = 'X';
		char b = 'X';
		while ((d = System.in.read()) != '\n')
		{
			if (a == 'X')
			{
				a = d;
			}
			if (a != d && b == 'X')
			{
				b = d;
			}
			if (d == a)
			{
				top++;
				stack[top] = i;
			}
			if (d == b)
			{
				System.out.print(stack[top]);
				System.out.print(' ');
				System.out.print(i);
				System.out.print("\n");
				top--;
			}
			i++;
		}
		return 0;
	}

}
