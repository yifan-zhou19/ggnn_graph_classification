package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
	String s = new String(new char[100]);
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	String d = new String(new char[100]);
			s = new Scanner(System.in).nextLine();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
		for (j = 0;;j += (i + 1))
		{
			for (i = 0;s.charAt(i + j) != ' ' && s.charAt(i + j) != 0;i++)
			{
			d = tangible.StringFunctions.changeCharacter(d, i, s.charAt(i + j));
			}
			d = tangible.StringFunctions.changeCharacter(d, i, '\0');
			if (strcmp(a,d) == 0)
			{
				  if (s.charAt(i + j) == 0)
				  {
					  System.out.printf("%s",b);
					  break;
				  }
			  else
			  {
				  System.out.printf("%s ",b);
			  }
			}
			else if (s.charAt(i + j) == 0)
			{
				System.out.printf("%s",d);
				break;
			}
				else
				{
					System.out.printf("%s ",d);
				}
		}
	}
}

