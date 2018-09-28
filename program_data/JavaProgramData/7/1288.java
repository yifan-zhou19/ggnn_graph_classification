package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[300]);
		String substring = new String(new char[300]);
		String replacement = new String(new char[300]);
		String test = new String(new char[300]);
		int lensub;
		int len;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
		len = String.length();
		lensub = substring.length();
		for (i = 0;i <= len - lensub;i++)
		{
			for (j = 1;j <= lensub;j++)
			{
				test = tangible.StringFunctions.changeCharacter(test, j - 1, string.charAt(i + j - 1));
				test = tangible.StringFunctions.changeCharacter(test, j, '\0');
			}
			if (strcmp(test,substring) != 0)
			{
				System.out.printf("%c",string.charAt(i));
			}
			else
			{
				System.out.printf("%s",replacement);
				i += lensub;
				break;
			}
		}
		for (;i <= len - 1;i++)
		{
			System.out.printf("%c",string.charAt(i));
		}
	}
}

