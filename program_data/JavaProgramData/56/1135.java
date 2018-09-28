package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[5]);
		String t = new String(new char[5]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
		   t = tangible.StringFunctions.changeCharacter(t, n - i - 1, a.charAt(i));
		}
		t = tangible.StringFunctions.changeCharacter(t, n, '\0');
		System.out.printf("%s\n", t);
	}
}

