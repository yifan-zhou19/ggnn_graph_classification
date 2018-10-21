package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char c;
	   String str = new String(new char[1000]);
	   String word = new String(new char[20]);
	   String longword = new String(new char[20]);
	   String shortword = new String(new char[20]);
	   int i;
	   int j;
	   int longlen = 0;
	   int shortlen = 20;
	   str = new Scanner(System.in).nextLine();
	   i = 0;
	   j = 0;
	   while ((c = str.charAt(i)) != '\0')
	   {
		 if (c != ' ')
		 {
		   word = tangible.StringFunctions.changeCharacter(word, j++, str.charAt(i++));
		 }
		 else
		 {
			i++;
			word = tangible.StringFunctions.changeCharacter(word, j, '\0');
			if (j > longlen)
			{
				 longlen = j;
				 longword = word;
			}
			if (j < shortlen)
			{
				 shortlen = j;
				 shortword = word;
			}
			j = 0;
		 }
	   }
		 word = word.substring(0, j);
		 if (j > longlen)
		 {
				 longlen = j;
				 longword = word;
		 }
			else if (j < shortlen)
			{
				 shortlen = j;
				 shortword = word;
			}
		System.out.println(longword);
		System.out.println(shortword);
	}
}

