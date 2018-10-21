package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (a.charAt(i) != '\0')
		{
			i++;
		}
		n = i - 1;
		for (i = 0;i <= n;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(n - i));
		}
		b = tangible.StringFunctions.changeCharacter(b, n + 1, '\0');
		System.out.printf("%s\n",b);
	}

}

