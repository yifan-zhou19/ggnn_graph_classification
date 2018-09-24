package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
	  String sz = new String(new char[200]);
	  sz = new Scanner(System.in).nextLine();
	  int k;
	  for (int i = 0;i < 100;i++)
	  {
		for (k = 0;sz.charAt(k) != '\0';k++)
		{
			if (sz.charAt(k) == ' ')
			{
				  if (sz.charAt(k + 1) == ' ')
				  {
					  for (;sz.charAt(k) != '\0';k++)
					  {
						sz = tangible.StringFunctions.changeCharacter(sz, k, sz.charAt(k + 1));
					  }
				  }
			}
		}
	  }
	  System.out.println(sz);
	  return 0;
	  }
}

