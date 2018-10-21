package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String zfc = new String(new char[6000]);
	   int i;
	   int j;
	   int k;
	   int m;
	   zfc = new Scanner(System.in).nextLine();
	   for (i = 1;zfc.charAt(i) != '\0';i++)
	   {
		   if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) == ' ')
		   {
			   for (k = i;zfc.charAt(k) != '\0';k++)
			   {
				   zfc = tangible.StringFunctions.changeCharacter(zfc, k, zfc.charAt(k + 1));
			   }
			   i--;
		   }
	   }
	   j = -1;
	   for (i = 0;zfc.charAt(i) != '\0';i++)
	   {
		   if (zfc.charAt(i) == ' ')
		   {
			   k = i - j - 1;
			   j = i;
			   System.out.printf("%d,",k);
		   }
	   }
	   m = zfc.length() - j - 1;
	   System.out.printf("%d",m);
	   return 0;
	}



}

