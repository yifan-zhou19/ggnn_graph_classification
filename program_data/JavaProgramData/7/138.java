package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		String sub = new String(new char[300]);
		String rep = new String(new char[300]);
		char m;
		char k;
		char n;
	  int i;
	  int j;
	  zfc = new Scanner(System.in).nextLine();
	  sub = new Scanner(System.in).nextLine();
	  rep = new Scanner(System.in).nextLine();
	  for (i = 0;i <= zfc.length() - sub.length();i++)
	  {
		  m = 0;
		  for (j = 0;j < sub.length();j++)
		  {
			  if (sub.charAt(j) != zfc.charAt(i + j))
			  {
				  m = -1;
			  break;
			  }
			  else
			  {
				  m = 1;
			  }
		  }
		  if (m == 1)
		  {
			  n = i;
			  break;
		  }
	  }
	if (m == 1)
	{
		for (k = n;k < n + sub.length();k++)
		{
			zfc = tangible.StringFunctions.changeCharacter(zfc, k, rep.charAt(k - n));
		}

		System.out.printf("%s",zfc);
	}

	else
	{
	System.out.printf("%s",zfc);
	}
	return 0;
	}


}

