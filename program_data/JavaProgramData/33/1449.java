package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 String zfc0 = new String(new char[100]);
	 zfc0 = new Scanner(System.in).nextLine();
	 n = Integer.parseInt(zfc0);
	 for (i = 0;i < n;i++)
	 {
	 String zfc = new String(new char[256]);
	 zfc = new Scanner(System.in).nextLine();

	 int a;
	 a = zfc.length();
	 for (k = 0;k < a;k++)
	 {
	  if (zfc.charAt(k) == 'A')
	  {
	  zfc = tangible.StringFunctions.changeCharacter(zfc, k, 'T');
	  }
	  else if (zfc.charAt(k) == 'G')
	  {
	  zfc = tangible.StringFunctions.changeCharacter(zfc, k, 'C');
	  }
	  else if (zfc.charAt(k) == 'C')
	  {
	  zfc = tangible.StringFunctions.changeCharacter(zfc, k, 'G');
	  }
	  else if (zfc.charAt(k) == 'T')
	  {
	  zfc = tangible.StringFunctions.changeCharacter(zfc, k, 'A');
	  }
	  else
	  {
		  zfc = tangible.StringFunctions.changeCharacter(zfc, k, '\0');
	  }
	 }
	 System.out.printf("%s\n",zfc);
	 }
	return 0;
	}

}

