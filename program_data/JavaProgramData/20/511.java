package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int l;
		char g;
		String str = new String(new char[15]);
		final String substr = "111";
		String te = new String(new char[15]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		do
		{
			te = str;
			g = System.in.read();
			for (i = 0;i < 3;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					substr = tangible.StringFunctions.changeCharacter(substr, i, tempVar2);
				}
			}
			l = str.length();
			for (i = 1,k = 0;i < l;i++)
			{
				if (str.charAt(k) < str.charAt(i))
				{
					k = i;
				}
			}
			for (i = k + 1;i < l;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, te.charAt(i));
			}
			str = tangible.StringFunctions.changeCharacter(str, l + 3, '\0');
			for (i = 1;i < 4;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, k + i, substr.charAt(i - 1));
			}
			System.out.println(str);
		} while (scanf("%s",str) != EOF);
	}
}

