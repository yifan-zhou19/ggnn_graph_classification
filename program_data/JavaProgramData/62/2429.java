package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j = 0;
		int i;
	 String a = new String(new char[1000]);
	 String b = new String(new char[1000]);
	 char c;
	 for (i = 0;i <= 1000;i++)
	 {
			 c = System.in.read();
		 a = tangible.StringFunctions.changeCharacter(a, i, c);
		 if (c == '\n')
		 {
			 break;
		 }
	 }
	 for (i = 0;i <= 1000;i++)
	 {
			 if (a.charAt(i) != ' ')
			 {
				 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				 j++;
			 }
		  if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
		  {
			  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			  j++;
		  }
		  if (a.charAt(i) == '\n')
		  {
			  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			  break;
		  }
		  else
		  {
			  continue;
		  }
	 }
	 for (i = 0;i <= j;i++)
	 {
		 System.out.print(b.charAt(i));
	 }
	 return 0;
	}
}

