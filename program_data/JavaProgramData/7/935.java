package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String zfc = new String(new char[LEN]);
	   String x = new String(new char[LEN]);
	   String y = new String(new char[LEN]);
	   String w = new String(new char[LEN]);
	   int len1;
	   int len2;
	   int len3;
	   int i;
	   int j;
	   int flag = 0;
	   int m;
	   int tag;
	   int k = 0;
	   zfc = new Scanner(System.in).nextLine();
	   x = new Scanner(System.in).nextLine();
	   y = new Scanner(System.in).nextLine();
	   len1 = zfc.length();
	   len2 = x.length();
	   len3 = y.length();
	   for (i = 0;i < len1;i++)
	   {
			  if (zfc.charAt(i) == x.charAt(0))
			  {
			   m = i;
			   tag = 0;
				 for (j = 0;j < len2;j++)
				 {
					 if (zfc.charAt(i + j) != x.charAt(j))
					 {
					   tag = 1;
					   break;
					 }
				 }
				 if (tag == 0)
				 {
							w = zfc;
							for (j = 0;j < len3;j++)
							{
								zfc = tangible.StringFunctions.changeCharacter(zfc, m + j, y.charAt(j));
							}
							 if (m + len3 > len1 || m + len3 == len1)
							 {
														   zfc = tangible.StringFunctions.changeCharacter(zfc, m + len3, '\0');
							 }
							 else if (m + len3 < len1)
							 {
											 for (i = m + len3;i < len1 + len3 - len2;i++)
											 {
												 zfc = tangible.StringFunctions.changeCharacter(zfc, i, w.charAt(m + len2 + k));
												 k++;
											 }
											 zfc = tangible.StringFunctions.changeCharacter(zfc, len1 + len3 - len2, '\0');
							 }
							flag = 1;
				 }

			  }
	   }

		  System.out.printf("%s\n",zfc);
						 return 0;
	}


}

