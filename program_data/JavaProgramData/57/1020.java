package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[40]);
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = tempVar2.charAt(0);
						 }
						 j = a.length();
						 if (a.charAt(j - 2) == 'e' && a.charAt(j - 1) == 'r')
						 {
						 a = tangible.StringFunctions.changeCharacter(a, j - 2, '\0');
						 }
						 else if (a.charAt(j - 2) == 'l' && a.charAt(j - 1) == 'y')
						 {
						 a = tangible.StringFunctions.changeCharacter(a, j - 2, '\0');
						 }
						 else if (a.charAt(j - 3) == 'i' && a.charAt(j - 2) == 'n' && a.charAt(j - 1) == 'g')
						 {
						 a = tangible.StringFunctions.changeCharacter(a, j - 3, '\0');
						 }
						 System.out.printf("%s\n",a);
		}



		return EXIT_SUCCESS;
	}

}

