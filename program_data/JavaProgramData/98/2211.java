package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		String word = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word = tempVar2.charAt(0);
		}
		System.out.printf("%s",word);
		sum = word.length();
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < 40;j++)
			{
				word = tangible.StringFunctions.changeCharacter(word, j, '\0');
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				word = tempVar3.charAt(0);
			}
			if (sum + word.length() + 1 <= 80)
			{
				System.out.printf(" %s",word);
				sum = sum + word.length() + 1;
			}
			else
			{
				System.out.printf("\n%s",word);
				sum = word.length();
			}
		}
		return 0;
	}
}

