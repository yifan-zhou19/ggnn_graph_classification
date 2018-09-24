package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			String a = new String(new char[1000]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.out.print(a);
			System.out.print('\n');
			int len = a.length();
			for (int i = 0;i < len;i++)
			{
				int l = -1;
				int r = -1;

				for (int j = i;j >= 0;j--)
				{
				if (a.charAt(j) == ')' && j != i)
				{
					break;
				}
				else if (a.charAt(j) == '(')
				{
					l = j;
					break;
				}
				}
				for (int j = i;j < len;j++)
				{
				if (a.charAt(j) == '(' && j != i)
				{
					break;
				}
				else if (a.charAt(j) == ')')
				{
					r = j;
					break;
				}
				}
				if (r != -1 && l != -1)
				{
					a = tangible.StringFunctions.changeCharacter(a, r, '0');
					a = tangible.StringFunctions.changeCharacter(a, l, '0');
				}
			}
			for (int i = 0;i < len;i++)
			{
				if (a.charAt(i) == '(')
				{
					System.out.print('$');
				}
				else if (a.charAt(i) == ')')
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(" ");
				}
			}
	System.out.print('\n');
		}
		return 0;
	}
}

