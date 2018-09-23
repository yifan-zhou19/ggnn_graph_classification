package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		int n;
		int i;
		int k;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				substr = tempVar2.charAt(0);
			}
			n = str.length();
			k = 0;
			for (i = 1;i < n;i++)
			{
				if (str.charAt(i) > str.charAt(k))
				{
					k = i;
				}
			}
			for (i = n + 3 - 1;i >= k + 1 + 3;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 3));
			}
			str = tangible.StringFunctions.changeCharacter(str, k + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, k + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, k + 3, substr.charAt(2));
			for (i = 0;i <= n + 3 - 1;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
					for (i = 0;i <= 13;i++)
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '\0');
					}

		for (;;)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				substr = tempVar4.charAt(0);
			}
			if (str.charAt(0) == '\0')
			{
				break;
			}
			n = str.length();
			k = 0;
			for (i = 1;i < n;i++)
			{
				if (str.charAt(i) > str.charAt(k))
				{
					k = i;
				}
			}
			for (i = n + 3 - 1;i >= k + 1 + 3;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 3));
			}
			str = tangible.StringFunctions.changeCharacter(str, k + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, k + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, k + 3, substr.charAt(2));
			System.out.print("\n");
			for (i = 0;i <= n + 3 - 1;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			for (i = 0;i <= 13;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			}
		}
	}
}

