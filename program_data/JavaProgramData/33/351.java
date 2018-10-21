package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int leap;
	String s = new String(new char[256]);
	String s1 = new String(new char[2]);
	String s2 = new String(new char[2]);
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
			 s = tempVar2.charAt(0);
		 }
	 l = s.length();
	 for (j = 0;j < l;j++)
	 {
		 leap = 0;
	 if (s.charAt(j) == 'A' && leap == 0)
	 {
		 s = tangible.StringFunctions.changeCharacter(s, j, 'T');
		 leap = 1;
	 }
	 if (s.charAt(j) == 'T' && leap == 0)
	 {
		 s = tangible.StringFunctions.changeCharacter(s, j, 'A');
		 leap = 1;
	 }
	 if (s.charAt(j) == 'G' && leap == 0)
	 {
		 s = tangible.StringFunctions.changeCharacter(s, j, 'C');
		 leap = 1;
	 }
	 if (s.charAt(j) == 'C' && leap == 0)
	 {
		 s = tangible.StringFunctions.changeCharacter(s, j, 'G');
		 leap = 1;
	 }

	 }
	 System.out.printf("%s\n",s);
	 for (j = 0;j < l;j++)
	 {
		 s = tangible.StringFunctions.changeCharacter(s, j, '\0');
	 }
	 }


	 return 0;
	}
}

