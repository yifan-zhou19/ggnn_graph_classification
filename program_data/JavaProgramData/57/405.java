package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String str = new String(new char[100]);
	 for (i = 0;i < n;i++)
	 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 str = tempVar2.charAt(0);
			 }
			 int len = str.length();
			 if ((str.charAt(len - 1) == 'r' && str.charAt(len - 2) == 'e') || (str.charAt(len - 1) == 'y' && str.charAt(len - 2) == 'l'))
			 {
				 str = tangible.StringFunctions.changeCharacter(str, len - 1, '\0');
			 str = tangible.StringFunctions.changeCharacter(str, len - 2, '\0');
			 }
			 else if (str.charAt(len - 1) == 'g' && str.charAt(len - 2) == 'n' && str.charAt(len - 3) == 'i')
			 {
				 str = tangible.StringFunctions.changeCharacter(str, len - 1, '\0');
			  str = tangible.StringFunctions.changeCharacter(str, len - 2, '\0');
			  str = tangible.StringFunctions.changeCharacter(str, len - 3, '\0');
			 }
			 System.out.printf("%s\n",str);
	 }

	return 0;
	}
}

