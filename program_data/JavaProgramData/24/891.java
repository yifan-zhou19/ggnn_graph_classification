package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: char allwords[WORD*LENGTH];
		String allwords = new String(new char[short * LENGTH]);

		int i;
		int minPos = 0;
		int maxPos = 0;
		int tmpPos = 0;
		int minLen = LENGTH;
		int maxLen = 0;
		int tmpLen = 0;

		allwords = new Scanner(System.in).nextLine();

		int len = allwords.length();

		for (i = 0; i < len + 1; i++)
		{

			if (allwords.charAt(i) == ' ' || allwords.charAt(i) == '\0')
			{
				if (tmpLen > maxLen)
				{
					maxPos = tmpPos;
					maxLen = tmpLen;
				}
				if (tmpLen < minLen)
				{
					minPos = tmpPos;
					minLen = tmpLen;
				}
				allwords = tangible.StringFunctions.changeCharacter(allwords, i, '\0');
				tmpLen = 0;
				tmpPos = i + 1;
			}
			else
			{
				tmpLen++;
			}
		}

		System.out.printf("%s\n", allwords.Substring(maxPos));
		System.out.printf("%s\n", allwords.Substring(minPos));


		return 0;
	}
}

