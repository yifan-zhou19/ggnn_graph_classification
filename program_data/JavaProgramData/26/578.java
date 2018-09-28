package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[100]);
	 s = new Scanner(System.in).nextLine();
	 int i;
	 int j;
	 int l;
	 l = s.length();
	 for (i = 0;i < l;i++)
	 {
	  if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
	  {
	   for (j = i + 1;j < l - 1;j++)
	   {
		s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
	   }
	   l--;
	   i--;
	  }
	 }
	 for (i = 0;i < l;i++)
	 {
	  System.out.printf("%c",s.charAt(i));
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

