package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str = new String(new char[1001]);
		 int a = 1;
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 str = tempVar.charAt(0);
		 }
		 for (i = 0;i < str.length();i++)
		 {
			 if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
			 {
				 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
			 }
		 }
		 for (i = 1;i <= str.length();i++)
		 {
			 if (str.charAt(i) == str.charAt(i - 1))
			 {
				 a++;
			 }
			 else
			 {
				 System.out.printf("(%c,%d)",str.charAt(i - 1),a);
				 a = 1;
			 }
		 }
	}
}

