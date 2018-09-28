package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		String s = new String(new char[33]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		n = s.length() - 1;
		if (s.charAt(n) == 'g')
		{
			s = s.substring(0, n - 2);
			s = s.substring(0, n - 1);
			s = s.substring(0, n);
		}
		else
		{
			s = tangible.StringFunctions.changeCharacter(s, n - 1, s[n] = 0);
		}
		System.out.printf("%s\n",s);
		}
		return 0;
	}
}

