package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[31]);
		int i;


		for (i = 0; i < 31; i++)
		{
			input = tangible.StringFunctions.changeCharacter(input, i, '\0');
		}

		input = new Scanner(System.in).nextLine();

		for (i = 0; i < 30; i++)
		{
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9')
			{

				System.out.printf("%c", input.charAt(i));

			}
			else
			{
				System.out.print("\n");
			}
		}

			return 0;
	}

}

