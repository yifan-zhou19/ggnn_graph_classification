package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: char allwords[WORD*LENGTH];
		String allwords = new String(new char[short * LENGTH]);

		int i;
		//int minPos = 0, maxPos = 0, tmpPos = 0;
		String minP;
		String maxP;
		String tmpP;
		int minLen = LENGTH;
		int maxLen = 0;
		int tmpLen = 0;

		allwords = new Scanner(System.in).nextLine();

		int len = allwords.length();

		minP = allwords.charAt(0);
		maxP = allwords.charAt(0);
		tmpP = allwords.charAt(0);

		for (i = 0; i < len + 1; i++)
		{
			if (allwords.charAt(i) == ' ' || allwords.charAt(i) == '\0')
			{
				if (tmpLen > maxLen)
				{
					maxP = tmpP;
					maxLen = tmpLen;
				}
				if (tmpLen < minLen)
				{
					minP = tmpP;
					minLen = tmpLen;
				}
				allwords = tangible.StringFunctions.changeCharacter(allwords, i, '\0');
				tmpLen = 0;
				tmpP = allwords.charAt(i + 1);
			}
			else
			{
				tmpLen++;
			}
		}

		System.out.printf("%s\n", maxP);
		System.out.printf("%s\n", minP);


		return 0;
	}
}

