package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[100]);
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int n;
		for (k = 0;k < m;k++)
		{
			n = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			n = str.length();
			if (str.charAt(n - 2) == 'e' && str.charAt(n - 1) == 'r')
			{
				str = tangible.StringFunctions.changeCharacter(str, n - 2, '\0');
				System.out.printf("%s\n",str);
			}
			else if (str.charAt(n - 1) == 'y' && str.charAt(n - 2) == 'l')
			{
				str = tangible.StringFunctions.changeCharacter(str, n - 2, '\0');
				System.out.printf("%s\n",str);
			}
			else if (str.charAt(n - 1) == 'g' && str.charAt(n - 2) == 'n' && str.charAt(n - 3) == 'i')
			{
				str = tangible.StringFunctions.changeCharacter(str, n - 3, '\0');
				System.out.printf("%s\n",str);
			}
			else
			{
				System.out.printf("%s\n",str);
			}
		}
	}
}

