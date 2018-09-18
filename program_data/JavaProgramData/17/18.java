package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String res = new String(new char[101]);
		int n;
		int[] stack = new int[100];
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len = str.length();
			for (int i = 0; i < len; i++)
			{
				res = tangible.StringFunctions.changeCharacter(res, i, ' ');
			}
			res = tangible.StringFunctions.changeCharacter(res, len, '\0');

			k = 0;
			for (int i = 0; i < len; i++)
			{
				if (str.charAt(i) == ')')
				{
					if (k != 0 && stack[k - 1] < 0)
					{
						k--;
					}
					else
					{
						stack[k++] = i + 1;
					}
				}
				else if (str.charAt(i) == '(')
				{
					stack[k++] = -(i + 1);
				}
			}
			for (int i = 0; i < k; i++)
			{
				int index = stack[i];
				if (index < 0)
				{
					res = tangible.StringFunctions.changeCharacter(res, -index - 1, '$');
				}
				else
				{
					res = tangible.StringFunctions.changeCharacter(res, index - 1, '?');
				}
			}
			System.out.print(str);
			System.out.print("\n");
			System.out.print(res);
			System.out.print("\n");
		}
		return 0;
	}
}

