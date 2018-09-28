package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		final String word = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tangible.StringFunctions.changeCharacter(word, i, tempVar2);
			}
			k = String.valueOf(word.charAt(i)).length();
			if ((word.charAt(i)[0] >= 65 && word.charAt(i)[0] <= 90) || (word.charAt(i)[0] >= 97 && word.charAt(i)[0] <= 122) || (word.charAt(i)[0] == '_'))
			{
				j = 1;
				while (j <= k - 1)
				{
					if (word.charAt(i)[j] == '_')
					{
						j = j + 1;
					}
					else if ((word.charAt(i)[j] >= 65) && (word.charAt(i)[j] <= 90))
					{
						j = j + 1;
					}
					else if ((word.charAt(i)[j] >= 97) && (word.charAt(i)[j] <= 122))
					{
						j = j + 1;
					}
					else if ((word.charAt(i)[j] >= 48) && (word.charAt(i)[j] <= 57))
					{
						j = j + 1;
					}
					else
					{
						break;
					}
				}
				if (j == k)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

