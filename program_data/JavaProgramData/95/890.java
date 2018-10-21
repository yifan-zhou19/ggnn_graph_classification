package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	   String str1 = new String(new char[400]);
	   String str2 = new String(new char[400]);
	   str1 = new Scanner(System.in).nextLine();
	   str2 = new Scanner(System.in).nextLine();

	   for (i = 0;(str1.charAt(i) == str2.charAt(i) || (str1.charAt(i) == str2.charAt(i) + 32) || (str1.charAt(i) == str2.charAt(i) - 32)) && str1.charAt(i) != '\0' && str2.charAt(i) != '\0';i++)
	   {
		  ;
	   }
	   str1 = tangible.StringFunctions.changeCharacter(str1, i, (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')?(str1.charAt(i) + 32):str1.charAt(i));
			str2 = tangible.StringFunctions.changeCharacter(str2, i, (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')?(str2.charAt(i) + 32):str2.charAt(i));


	   if (str1.charAt(i) > str2.charAt(i))
	   {
		   System.out.print(">");
	   }
	   else if (str1.charAt(i) < str2.charAt(i))
	   {
		   System.out.print("<");
	   }
	   else if (str1.charAt(i) == str2.charAt(i))
	   {
		   System.out.print("=");
	   }

	}



}

