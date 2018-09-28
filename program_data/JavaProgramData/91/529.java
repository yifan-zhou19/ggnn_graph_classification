package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[150]);
		char e;
		a = new Scanner(System.in).nextLine();
		e = a.charAt(0);
		for (i = 0;i < a.length() - 1;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + a.charAt(i + 1));
			System.out.printf("%c",a.charAt(i));
		}
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + e);
		System.out.printf("%c",a.charAt(i));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

