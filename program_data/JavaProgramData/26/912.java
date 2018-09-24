package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[101]);
	String ss = new String(new char[100]);
	s = new Scanner(System.in).nextLine();
	int i;
	int j = 0;
	for (i = 0;i < s.length();i++)
	{
	  if (s.charAt(i) != ' ')
	  {
	   ss = tangible.StringFunctions.changeCharacter(ss, j, s.charAt(i));
		  j++;
	  }
	   else if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
	   {
		   ss = tangible.StringFunctions.changeCharacter(ss, j, ' ');
		   ss = tangible.StringFunctions.changeCharacter(ss, j + 1, s.charAt(i + 1));
		  j++;
	   }

	}
	 int m;
	for (m = 0;m < j;m++)
	{
		System.out.printf("%c",ss.charAt(m));
	}
	 return 0;
	}




}

