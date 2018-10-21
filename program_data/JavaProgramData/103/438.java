package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String letter = new String(new char[1000]);
		int[] nletter = new int[1000];
		String str = new String(new char[1000]);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(letter,'\0',1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,'\0',1000);

		for (int i = 0;i <= 1000 - 1;i++)
		{
			nletter[i] = 1;
		}

		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		int n = 0;

		letter = tangible.StringFunctions.changeCharacter(letter, 0, str.charAt(0));

		for (int i = 0;i <= len - 1;i++)
		{
			if (letter.charAt(n) != str.charAt(i + 1) && (letter.charAt(n) != str.charAt(i + 1) + 'A'-'a') && (letter.charAt(n) != str.charAt(i + 1) - 'A'+'a'))
			{
				letter = tangible.StringFunctions.changeCharacter(letter, ++n, str.charAt(i + 1));
			}
			else
			{
				nletter[n]++;
			}
		}
		for (int i = 0;i <= n - 1;i++)
		{
			if (letter.charAt(i) > 'Z')
			{
				letter.charAt(i) += ('A'-'a');
			}
		}

		for (int i = 0;i <= n - 1;i++)
		{
			System.out.print("(");
			System.out.print(letter.charAt(i));
			System.out.print(",");
			System.out.print(nletter[i]);
			System.out.print(")");
		}
		System.out.print("\n");
		return 0;
	}

}

