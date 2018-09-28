package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int l;
	  int k;
	  int j = 0;
	  final String b = "";
	  final String c = "";
	  b = new Scanner(System.in).nextLine();
	  for (i = 0;i < 100;i++)
	  {
		   if (b.charAt(i) == '\0')
		   {
			   k = i;
		   for (l = j;l < i;l++)
		   {
				c = tangible.StringFunctions.changeCharacter(c, 100 - i - j + l, b.charAt(l));
		   }
		   break;
		   }
		   if (b.charAt(i) == ' ')
		   {
		   c = tangible.StringFunctions.changeCharacter(c, 99 - i, b.charAt(i));
		   for (l = j;l < i;l++)
		   {
				c = tangible.StringFunctions.changeCharacter(c, 100 - i - j + l, b.charAt(l));
		   }
		   j = i + 1;
		   }
	  }
	  for (i = 100 - k;i < 100;i++)
	  {
	  System.out.printf("%c",c.charAt(i));
	  }
	}
}

