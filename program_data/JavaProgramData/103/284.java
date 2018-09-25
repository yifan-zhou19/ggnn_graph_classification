package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int counter;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) + 'A'-'a');
			}
		}
		char temp;
		counter = 1;
		temp = str.charAt(0);
		for (i = 1;str.charAt(i - 1) != '\0';i++)
		{
			if (temp == str.charAt(i))
			{
				counter++;
			}
			else
			{
				System.out.print('(');
				System.out.print(temp);
				System.out.print(',');
				System.out.print(counter);
				System.out.print(')');
				counter = 1;
				temp = str.charAt(i);
			}
		}
		return 0;
	}
}

