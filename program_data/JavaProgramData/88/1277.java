package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String words = new String(new char[MAXNUM]);
	 String temp = new String(new char[MAXNUM]);
	 words = new Scanner(System.in).nextLine();
	 int len1;
	 int len2;
	 int ans;
	 len1 = words.length();
	 len2 = 0;
	 for (int i = 0;i < len1;i++)
	 {
	  if (words.charAt(i) >= 48 && words.charAt(i) <= 57)
	  {
	   temp = tangible.StringFunctions.changeCharacter(temp, len2++, words.charAt(i));
	  }
	   else
	   {
		if (len2 >= 1)
		{
		  temp = tangible.StringFunctions.changeCharacter(temp, len2, '\0');
		  System.out.print((int)Double.parseDouble(temp));
		  System.out.print("\n");
		  len2 = 0;
		}
		else
		{
		 continue;
		}
	   }
	 }
	 if (len2 >= 1 && (words.charAt(len1 - 1) >= 48 && words.charAt(len1 - 1) <= 57))
	 {
		 temp = tangible.StringFunctions.changeCharacter(temp, len2, '\0');
	 System.out.print((int)Double.parseDouble(temp));
	 }
	 return 0;
	}

}

