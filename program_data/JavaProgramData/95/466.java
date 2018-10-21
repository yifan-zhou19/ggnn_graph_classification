package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 String s1 = new String(new char[100]);
	 String s2 = new String(new char[100]);
	 int len1;
	 int len2;
	 int i;
	 s1 = new Scanner(System.in).nextLine();
	 s2 = new Scanner(System.in).nextLine();
	 len1 = s1.length();
	 len2 = s2.length();
	 for (i = 0;i < len1;i++)
	 {
		 if ((s1.charAt(i) >= 65) && (s1.charAt(i) <= 90))
		 {
			 s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
		 }
	 }
	for (i = 0;i < len2;i++)
	{
		 if ((s2.charAt(i) >= 65) && (s2.charAt(i) <= 90))
		 {
			 s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
		 }
	}
	if (strcmp(s1,s2) < 0)
	{
		System.out.print("<");
	}
	if (strcmp(s1,s2) == 0)
	{
		System.out.print("=");
	}
	if (strcmp(s1,s2) > 0)
	{
		System.out.print(">");
	}
	}



}

