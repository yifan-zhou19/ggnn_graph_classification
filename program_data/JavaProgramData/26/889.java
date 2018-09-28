package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[101]);
	   String t = new String(new char[101]);
	   int n;
	   int i;
	   int j = 0;
	   s = new Scanner(System.in).nextLine();
	   n = s.length();
	   for (i = 0;i < n;i++)
	   {
			if (s.charAt(i) != ' ')
			{
		 t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
		 j++;
			}
		else if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
		{
		  continue;
		}
		else
		{
		   t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
		   j++;
		}
	   }
		 t = tangible.StringFunctions.changeCharacter(t, j, '\0');
		System.out.printf("%s",t);
		return 0;
	}
}

