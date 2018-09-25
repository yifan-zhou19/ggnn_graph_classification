package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int a = 1;
		 String str = new String(new char[1010]);
		  String str2 = new String(new char[1010]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 str = tempVar.charAt(0);
		 }
		 for (int j = 0;;j++)
		 {
			if (str.charAt(j) == '\0')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
				break;
			}
		 if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z')
		 {
			 str2 = tangible.StringFunctions.changeCharacter(str2, j, str.charAt(j) - 'a'+'A');
		 }
		 else
		 {
			 str2 = tangible.StringFunctions.changeCharacter(str2, j, str.charAt(j));
		 }
		 }

		 for (i = 0;i < str2.length();i++)
		 {

			 if (str2.charAt(i) == str2.charAt(i + 1))
			 {
			 a++;
			 }
			 else
			 {
				 System.out.printf("(%c,%d)",str2.charAt(i),a);
				 a = 1;
				 continue;
			 }
		 }



	}

}

