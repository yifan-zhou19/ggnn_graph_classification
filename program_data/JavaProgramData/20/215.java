package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		   String str = new String(new char[15]);
		   String substr = new String(new char[3]);
		   char[][] string = new char[500][15];
		   char max;
		   int i;
		   int x;
		   int d;
		   int j;
		   j = 0;

		while (gets(str) != null)
		{
			   // gets(str);

			   d = str.length();
	if (d == 0)
	{
		break;
	}
						   for (i = 0;i < d;i++)
						   {
						   if (str.charAt(i) == ' ')
						   {
								   break;
						   }
						   }
						   for (x = i + 1;x <= i + 4;x++)
						   {
								   substr = tangible.StringFunctions.changeCharacter(substr, x - i - 1, str.charAt(x));
						   }
						   str = tangible.StringFunctions.changeCharacter(str, i, '\0');
						   d = d - 3;
			   max = str.charAt(0);
				   x = 0;
				   for (i = 0;str.charAt(i) != '\0';i++)
				   {
				  if (str.charAt(i) > max)
				  {
								   max = str.charAt(i);
						x = i;
				  }
				   }
				for (i = d - 1;i > x;i--)
				{
				   str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
				}
				   for (i = x + 1;i < x + 4;i++)
				   {
						   str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(i - x - 1));
				   }
				   String[j] = str;
				   String[j][d + 3] = '\0';
				   j = j + 1;

		}
		   for (i = j;i < 500;i++)
		   {
		   String[i][0] = '\0';
		   }
	 for (i = 0;i < j;i++)
	 {
			System.out.printf("%s\n",string[i]);
	 }
	}
}

