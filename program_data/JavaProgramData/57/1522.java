package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String a = new String(new char[50]);
	   String b = new String(new char[50]);
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = tempVar2.charAt(0);
		   }
		k = a.length();
		String c;
		String d;
		c = a.Substring(k) - 2;
		d = a.Substring(k) - 3;
		if (strcmp(c,"er") == 0)
		{
			for (j = 0;j < k - 2;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
			}
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			System.out.printf("%s\n",b);
		}
		else if (strcmp(c,"ly") == 0)
		{
			for (j = 0;j < k - 2;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
			}
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			System.out.printf("%s\n",b);
		}
		else if (strcmp(d,"ing") == 0)
		{
			for (j = 0;j < k - 3;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
			}
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			System.out.printf("%s\n",b);
		}
	   }
	   return 0;
	}

}

