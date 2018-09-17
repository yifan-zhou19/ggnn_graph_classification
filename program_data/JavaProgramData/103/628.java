package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int i;
		 int n;
			n = 1;
		 String str = new String(new char[1001]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 str = tempVar.charAt(0);
		 }
		 for (i = 0;i < str.length();i++)
		 {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
			   str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
			}
		 }
		 i = 0;
		 while (i < str.length())
		 {
			if (str.charAt(i) == str.charAt(i + 1))
			{
			   n = n + 1;
			}
			else
			{
			   System.out.printf("(%c,%d)",str.charAt(i),n);
			   n = 1;
			}
			i++;
		 }
	 }
}

