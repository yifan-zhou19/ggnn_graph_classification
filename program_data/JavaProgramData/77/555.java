package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100];
		int sum = 0;
		int top = 0;
		char b;
		char a;
		s[0] = 0;
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (top >= 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sum++;
			if (a == b)
			{
				s[++top] = sum;
			}
			else
			{
				System.out.print(s[top]);
				System.out.print(" ");
				System.out.print(sum);
				System.out.print("\n");
				top--;
			}
		}
		return 0;
	}
}

