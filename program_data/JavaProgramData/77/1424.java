package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[100]);
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = (int)ch.length();
		for (int i = 0;i < len;i++)
		{
			if (ch.charAt(i) == ')' || ch.charAt(i) == '}' || ch.charAt(i) == ']' || ch.charAt(i) == '>')
			{
				int j = i;
				while (ch.charAt(j) != '(' && ch.charAt(j) != '{' && ch.charAt(j) != '[' && ch.charAt(j) != '<')
				{
					j--;
				}
				System.out.print(j);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				ch = tangible.StringFunctions.changeCharacter(ch, i, '%');
				ch = tangible.StringFunctions.changeCharacter(ch, j, '%');
			}
		}
		return 0;
	}
}

