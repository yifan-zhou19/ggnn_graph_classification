package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[30]);
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			str = new Scanner(System.in).nextLine();
		m = str.length();
		if (str.charAt(m - 1) == 'g')
		{
		str = tangible.StringFunctions.changeCharacter(str, m - 3, '\0');
		}
		else
		{
			str = tangible.StringFunctions.changeCharacter(str, m - 2, '\0');
		}
		System.out.printf("%s\n",str);
		}
	}

}

