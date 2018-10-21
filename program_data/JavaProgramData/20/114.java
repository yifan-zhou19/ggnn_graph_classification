package <missing>;

public class GlobalMembers
{
	public static void charu()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char c;
		String a = new String(new char[11]);
		int i = 0;
		int k;
		int s;

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
		k = str.length();
		if (str.length() >= 11 || substr.length() >= 4)
		{
			return;
		}
		for (i = 0;i < k;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, str.charAt(i));
		}
		for (i = k;i < 11;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}

		for (i = 0;i < k - 1;i++)
		{
			if (a.charAt(i) > a.charAt(i + 1))
			{
				c = a.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
				a = tangible.StringFunctions.changeCharacter(a, i + 1, c);
			}
		}
		for (i = 0;i < k;i++)
		{
			if (str.charAt(i) == a.charAt(k - 1))
			{
				s = i;
				break;
			}
		}
		for (i = 0;i < s + 1;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (i = s + 1;i < k;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		charu();
	}

	public static void Main()
	{
		charu();
	}
}

