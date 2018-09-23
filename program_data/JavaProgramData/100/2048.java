package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int k;
		   int a;
		   int i = 1;
		   int j;
		   int x = 0;
		   char[][] sc = new char[100][2];
		   String zfc = new String(new char[300]);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   zfc = tempVar.charAt(0);
		   }

		   int e;

		   for (k = 1;k < zfc.length();k++)
		   {
				   for (int a = 0;a < zfc.length() - k;a++)
				   {
						   if (zfc.charAt(a) > zfc.charAt(a + 1))
						   {
								   e = zfc.charAt(a + 1);
								   zfc = tangible.StringFunctions.changeCharacter(zfc, a + 1, zfc.charAt(a));
								   zfc = tangible.StringFunctions.changeCharacter(zfc, a, e);

						   }
				   }
		   }

	   for (j = 0;j < zfc.length();j++)
	   {
				   i = 1;
				   while (zfc.charAt(j) == zfc.charAt(j + 1))
				   {
								   j++;
								   i++;
				   }
		   if (((zfc.charAt(j) >= 65) && (zfc.charAt(j) <= 90)) || ((zfc.charAt(j) >= 97) && (zfc.charAt(j) <= 122)))
		   {
						   System.out.printf("%c=%d\n",zfc.charAt(j),i);
						   x++;
		   }

	   }
		   if (x == 0)
		   {
				   System.out.print("No\n");
		   }

		   return 0;
	}

}

