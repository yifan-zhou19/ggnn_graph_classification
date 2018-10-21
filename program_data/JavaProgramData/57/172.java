package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		String[] word = {""};
		int n = 0;
		int i = 0;
		int k = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			k = a.length();
			if (a.charAt(k - 1) == 103)
			{
				a = tangible.StringFunctions.changeCharacter(a, k - 2, '\0');
				a = tangible.StringFunctions.changeCharacter(a, k - 1, '\0');
				a = tangible.StringFunctions.changeCharacter(a, k - 3, '\0');
			}
			else
			{
			   a = tangible.StringFunctions.changeCharacter(a, k - 2, '\0');
			   a = tangible.StringFunctions.changeCharacter(a, k - 1, '\0');
			}
		word[i] = a;
		}
		for (m = 0;m < n;m++)
		{
			System.out.printf("%s\n",word[m]);
		}
	}
}

