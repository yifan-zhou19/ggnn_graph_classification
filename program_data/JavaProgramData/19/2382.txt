package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String SourceStr = "";
		final String ToReplaceStr = "";
		final String Replacement = "";
		final String Str = "";
		int index = 0;
		int WordIndex = 0;
		int LetterIndex = 0;
		int i;

		SourceStr = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ToReplaceStr = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			Replacement = tempVar2.charAt(0);
		}
		while (SourceStr.charAt(index) != '\0')
		{
			while ((SourceStr.charAt(index) != ' ') && (SourceStr.charAt(index) != '\0'))
			{
				Str.charAt(WordIndex)[LetterIndex] = SourceStr.charAt(index);
				//printf("%c",SourseStr[index]);
				//printf("\tWordIndex = %d\tIndex = %d\n", WordIndex, index);
				LetterIndex++;
				index++;
			}
			//printf("Word %d is %s\n", WordIndex, Str[WordIndex]);
			LetterIndex = 0;
			WordIndex++;
			index++;
		}
		for (i = 0; i < WordIndex; i++)
		{
			if (!strcmp(Str.charAt(i), ToReplaceStr))
			{
				Str = tangible.StringFunctions.changeCharacter(Str, i, Replacement);
			}
		}
		for (i = 0; i < WordIndex - 1; i++)
		{
			System.out.printf("%s ",Str.charAt(i));
		}
		System.out.printf("%s", Str.charAt(WordIndex - 1));
		return 0;
	}
}

