package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[256]);
	   String a = new String(new char[256]);
	   String b = new String(new char[256]);
	   String tmp = new String(new char[256]);
	   int i;
	   int lenstr;
	   int lena;
	   String pstr;
	   str = new Scanner(System.in).nextLine();
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
	   lenstr = str.length();
	   lena = a.length();

	   for (i = 0;i <= lenstr - lena;i++)
	   {
		  pstr = str.charAt(i);
		  tmp = pstr.substring(0, lena);
		  tmp = tangible.StringFunctions.changeCharacter(tmp, lena, '\0');

		  if (strcmp(tmp,a) == 0)
		  {
			 str = tangible.StringFunctions.changeCharacter(str, i, '@');
			 break;
		  }
	   }

	   for (i = 0;i < lenstr;i++)
	   {
		  if (str.charAt(i) == '@')
		  {
			System.out.printf("%s",b);
			i = i + lena - 1;
		  }
		  else
		  {
			  System.out.printf("%c",str.charAt(i));
		  }
	   }
	   System.out.print("\n");

	  return 0;
	}



}

