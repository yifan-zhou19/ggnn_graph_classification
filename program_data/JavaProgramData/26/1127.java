package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int l;
	  int i;
	  int m;
	  String z = new String(new char[1000]);
	  char c;
	  z = new Scanner(System.in).nextLine();
	  l = z.length();
	  m = l;
	  for (int t = 0;t < l;t++)
	  {
		  for (i = 0;i < l;i++)
		  {
			  if (z.charAt(i) == ' ')
			  {
				  if (z.charAt(i + 1) == ' ')
				  {
					  for (i;i < l;i++)
					  {
						  z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i + 1));
					  }
					  z = z.substring(0, m - 1);
					  m--;
					  i--;
				  }
			  }
		  }
	  }
	  System.out.printf("%s",z);
	return 0;
	}
}

