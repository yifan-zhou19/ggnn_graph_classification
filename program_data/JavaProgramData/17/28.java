package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int t;
		int len;
		String a = new String(new char[100]);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			t = 0;
			m = 0;
			System.out.print(a);
			System.out.print("\n");
			len = a.length();
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, 'a');
							a = tangible.StringFunctions.changeCharacter(a, j, 'a');
							break;
						}
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if ((a.charAt(i) == '(') || (a.charAt(i) == ')'))
				{
					m = i;
					break;
				}
			}
			for (i = len - 1;i >= 0;i--)
			{
				if ((a.charAt(i) == '(') || (a.charAt(i) == ')'))
				{
					t = i;
					break;
				}
			}
			for (i = m;i <= t;i++)
			{
				if (a.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else if (a.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

