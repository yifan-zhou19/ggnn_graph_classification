package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int h;
		int g;
		int l;
		int p;
		String zfc = new String(new char[200]);
		String zfc1 = new String(new char[200]);
		char e;
		char a;
		zfc = new Scanner(System.in).nextLine();
		m = zfc.length();
		p = 0;
		zfc1 = tangible.StringFunctions.changeCharacter(zfc1, 0, zfc.charAt(0));
	   for (k = 1;k < n;k++)
	   {
		   if (zfc.charAt(k) == ' ' && zfc.charAt(k - 1) != ' ')
		   {
			   p++;
		   zfc1 = tangible.StringFunctions.changeCharacter(zfc1, p, zfc.charAt(k));
		   }
		   else if (zfc.charAt(k) != ' ')
		   {
			   p++;
		   zfc1 = tangible.StringFunctions.changeCharacter(zfc1, p, zfc.charAt(k));
		   }
	   }
		  System.out.printf("%s",zfc1);
	   return 0;
	}



}

