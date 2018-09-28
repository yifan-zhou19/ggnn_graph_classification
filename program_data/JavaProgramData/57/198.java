package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
	 String s = new String(new char[20]);
	 int i;
	 int p;
	 char[][] c = new char[100][20];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 c[i] = tempVar2.charAt(0);
		 }
	 }
	for (i = 0;i < n;i++)
	{
		 p = String.valueOf(c[i]).length();

		 if (c[i][p - 2] == 'e' && c[i][p - 1] == 'r')
		 {
			 s = String.valueOf(c[i]).substring(0, p - 2);
			  s = tangible.StringFunctions.changeCharacter(s, p - 2, '\0');
			 System.out.printf("%s\n",s);

		 }
		 else if (c[i][p - 2] == 'l' && c[i][p - 1] == 'y')
		 {
			 s = String.valueOf(c[i]).substring(0, p - 2);
					 s = tangible.StringFunctions.changeCharacter(s, p - 2, '\0');
			 System.out.printf("%s\n",s);

		 }
		 else
		 {
			 s = String.valueOf(c[i]).substring(0, p - 3);
			 s = tangible.StringFunctions.changeCharacter(s, p - 3, '\0');
			 System.out.printf("%s\n",s);
		 }
	}
	}
}

