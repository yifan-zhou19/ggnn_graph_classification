package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ans = new String(new char[100]);
		char c;
		int[] stack = new int[100];
		int top = 0;
		int l = 0;
		while (scanf("%c", c) == 1)
		{
			System.out.print(c);
			if (c == '\n')
			{
				ans = tangible.StringFunctions.changeCharacter(ans, l, '\0');
				System.out.print(ans);
				System.out.print("\n");
				top = 0;
				l = 0;
				continue;
			}
			if (c == '(')
			{
				stack[top++] = l;
				ans = tangible.StringFunctions.changeCharacter(ans, l, '$');
				l++;
				continue;
			}
			if (c == ')')
			{
				if (top == 0)
				{
					ans = tangible.StringFunctions.changeCharacter(ans, l++, '?');
					continue;
				}
				else
				{
					ans = tangible.StringFunctions.changeCharacter(ans, l++, ' ');
					ans = tangible.StringFunctions.changeCharacter(ans, stack[--top], ' ');
					continue;
				}
			}
			ans = tangible.StringFunctions.changeCharacter(ans, l++, ' ');
		}
		System.out.print("\n");
		ans = tangible.StringFunctions.changeCharacter(ans, l, '\0');
		System.out.print(ans);
		System.out.print("\n");

		return 0;
	}

}

