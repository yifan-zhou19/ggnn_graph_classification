package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String kid = new String(new char[101]);
		int i;
		int j;
		kid = new Scanner(System.in).nextLine();
		for (i = 0;i < kid.length();i++)
		{
			if (kid.charAt(i) != kid.charAt(0))
			{
			  j = '0';
			  for (j = i - 1;;j--)
			  {
				  if (kid.charAt(j) != '0')
				  {
					  break;
				  }
			  }
			  if (kid.charAt(i) != kid.charAt(j))
			  {
				  System.out.printf("%d %d\n",j,i);
				  kid = tangible.StringFunctions.changeCharacter(kid, i, '0');
				  kid = tangible.StringFunctions.changeCharacter(kid, j, '0');
			  }
			}
		}

		return 0;
	}
}

