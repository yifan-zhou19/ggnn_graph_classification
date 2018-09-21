package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
	   str = new Scanner(System.in).nextLine();
	   String word = new String(new char[50]);
	   String longword = new String(new char[50]);
	   String shortword = new String(new char[50]);
	   int longnum = 0;
	   int shortnum = 50;
	   int k = 0;
	   int i;
	   int j;
	   int num = 0;
	   for (i = 0;i < str.length();i++)
	   {
			  if (str.charAt(i) != ' ' && str.charAt(i) != ',')
			  {
				  num++;
					word = tangible.StringFunctions.changeCharacter(word, k, str.charAt(i));
					k++;


			  }
			   if (((str.charAt(i) == ' ' || str.charAt(i) == ',') && str.charAt(i - 1) != ' ' && str.charAt(i - 1) != ',') || str.charAt(i + 1) == 0)
			   {
				   if (longnum < num)
				   {
						longnum = num;
					 longword = word;
				   }
					if (shortnum > num)
					{
						shortnum = num;
					 shortword = word;
					}
					num = 0;
					k = 0;
				   for (j = 0;word.charAt(j) != 0;j++)
				   {
					   word = word.substring(0, j);
				   }
			   }
	   }
	   longword = tangible.StringFunctions.changeCharacter(longword, longnum, '\0');

	   System.out.printf("%s\n%s",longword,shortword);
	return 0;
	}


}

