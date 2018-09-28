package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[30]);
		int n;
		int i;
		char de = char a.charAt(30);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = tempVar2.charAt(0);
		 }
		 int m;
		 m = a.length();
		 if (a.charAt(m - 1) == 'y' && a.charAt(m - 2) == 'l')
		 {
			 a = tangible.StringFunctions.changeCharacter(a, m - 2, '\0');
			 System.out.printf("%s\n",a);
		 }
		 else if (a.charAt(m - 1) == 'g' && a.charAt(m - 2) == 'n' && a.charAt(m - 3) == 'i')
		 {
			 a = tangible.StringFunctions.changeCharacter(a, m - 3, '\0');
			 System.out.printf("%s\n",a);
		 }
		 else if (a.charAt(m - 1) == 'r' && a.charAt(m - 2) == 'e')
		 {
			 a = tangible.StringFunctions.changeCharacter(a, m - 2, '\0');
			 System.out.printf("%s\n",a);
		 }
		}

	}
}

