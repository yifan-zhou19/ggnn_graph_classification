package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String str1 = new String(new char[1000]);
		int i;
		int j = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ' || str.charAt(i + 1) != ' ')
			{
			str1 = tangible.StringFunctions.changeCharacter(str1, j, str.charAt(i));
			j++;
			}
		}
	  for (i = 0;i < j;i++)
	  {
		  System.out.printf("%c",str1.charAt(i));
	  }
	System.in.read();
	System.in.read();
	}

}

