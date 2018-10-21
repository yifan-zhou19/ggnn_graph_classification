package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int num = 0;
	   int l1;
	   int l2;
	   String str1 = new String(new char[80]);
	   String str2 = new String(new char[80]);
	   str1 = new Scanner(System.in).nextLine();
	   str2 = new Scanner(System.in).nextLine();
	   l1 = str1.length();
	   l2 = str2.length();
	   for (i = 0;i < l1;i++)
	   {
		   if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
		   {
			   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
		   }
				if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
				}

			  if (str1.charAt(i) == str2.charAt(i))
			  {
				 num++;
				 continue;
			  }
		  else if (str1.charAt(i) < str2.charAt(i))
		  {
			  System.out.print('<');
			  break;
		  }
		  else if (str1.charAt(i) > str2.charAt(i))
		  {
			  System.out.print('>');
			  break;
		  }


	   }
	  if (num == l1)
	  {
		  System.out.print('=');
	  }
	 return 0;

	}
}

