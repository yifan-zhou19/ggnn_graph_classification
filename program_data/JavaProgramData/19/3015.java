package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[103]); //?????a??????word??????rep??????b
		String word = new String(new char[103]);
		String rep = new String(new char[103]);
		String b = new String(new char[203]);
		char i;
		char j;
		cin.get(a,101,'\n'); //????????
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int wordlen = word.length(); //??????????
		int alen = a.length();
		int replen = rep.length();
		for (i = alen;i > 0;i--)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 1));
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, ' ');
		a = tangible.StringFunctions.changeCharacter(a, alen + 1, ' ');
		a = tangible.StringFunctions.changeCharacter(a, alen + 2, '\0');
		for (i = 1,j = 0;i < alen + 2;i++,j++)
		{
			if (a.charAt(i - 1) == ' ' && a.charAt(i + wordlen) == ' ' && strncmp(a + i,word,wordlen) == 0) //????????????i???????????????????????
			{
				b + j = rep;
				i = i + wordlen - 1;
				j = j + replen - 1; //????????????????????????????
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j - 1, '\0'); //??????????
		for (i = 0;;i++)
		{
			if (b.charAt(i) != '\0')
			{
				System.out.print(b.charAt(i));
			}
			else
			{
				break;
			}
		}
		return 0;
	}


}

