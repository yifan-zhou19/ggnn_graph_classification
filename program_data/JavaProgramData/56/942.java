package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10]);
		final String b = "";
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i <= n - 1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(n - i - 1));
		}
		System.out.println(b);
	}
}

