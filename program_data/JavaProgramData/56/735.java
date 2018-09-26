package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[6]);
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		b = a.length();
		for (i = 0;i < (b - 1) / 2;i++)
		{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(b - i - 1) + a.charAt(i));
				a = tangible.StringFunctions.changeCharacter(a, b - i - 1, a.charAt(i) - a.charAt(b - i - 1));
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - a.charAt(b - i - 1));
		}
		System.out.printf("%s\n",a);
	}
}

