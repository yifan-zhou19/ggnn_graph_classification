package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int m = 1; m <= n; m++)
		{
			String str = new String(new char[105]);
			String str2 = new String(new char[105]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int[] stack = new int[105];
			int len = str.length();
			int k = 0;
			for (int i = 0; i < len; i++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, ' ');
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, len, '\0');
			for (int i = 0; i < len; i++)
			{
				if (str.charAt(i) == ')')
				{
					if (k == 0 || stack[k - 1] > 0)
					{
						stack[k++] = i + 1;
					}
					else
					{
						k--;
					}
				}
				else if (str.charAt(i) == '(')
				{
					stack[k++] = - i - 1;
				}
			}
			for (int i = 0; i < k; i++)
			{
				if (stack[i] < 0)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, -stack[i] - 1, '$');
				}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, stack[i] - 1, '?');
				}
			}
			System.out.print(str);
			System.out.print("\n");
			System.out.print(str2);
			System.out.print("\n");
		}
		return 0;
	}
}

