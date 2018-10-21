package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i = 0;
		String string = new String(new char[101]);
		String string_copy = new String(new char[101]);
		String string_check = new String(new char[101]);
		int len = 0;
		int index = 0;
		int start = 0;
		int turn = 0;
		char y = 'n';


		for (i = 0;i <= n;i++)
		{
			len = 0;
			String = new Scanner(System.in).nextLine();
			while (String[len])
			{
				len++;
			}

			string_copy = String;

			for (index = 0;index < len;index++)
			{
				if (string_copy.charAt(index) != '(' && string_copy.charAt(index) != ')')
				{
					string_copy = tangible.StringFunctions.changeCharacter(string_copy, index, ' ');
				}
				if (String[index] == '(' || string.charAt(index) == ')')
				{
					y = 'y';
				}
			}
			if (y == 'n')
			{
				continue;
			}


			for (turn = 0;turn <= len / 2;turn++)
			{
				y = 'n';
				start = 0;
				for (index = 0;index < len;index++)
				{
					if (string_copy.charAt(index) == '(')
					{
						start = index;
					}
					if (string_copy.charAt(index) == ')' && string_copy.charAt(start) == '(')
					{
						string_copy = tangible.StringFunctions.changeCharacter(string_copy, index, ' ');
						string_copy = tangible.StringFunctions.changeCharacter(string_copy, start, ' ');
					}
				}
			}



			string_check = string_copy;
			for (index = 0;index < len;index++)
			{
				if (string_copy.charAt(index) == '(')
				{
					string_copy = tangible.StringFunctions.changeCharacter(string_copy, index, '$');
				}
				if (string_copy.charAt(index) == ')')
				{
					string_copy = tangible.StringFunctions.changeCharacter(string_copy, index, '?');
				}
			}
			if (strcmp(string_copy,string_check) != 0)
			{
				System.out.printf("%s\n%s\n",String,string_copy);
			}
			else
			{
				System.out.printf("%s\n",String);
			}
		}


		return 0;
	}


}

