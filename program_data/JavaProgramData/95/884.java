package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012826_30_01.cpp
	 *
	 *  Created on: 2010-11-14
	 *      Author: Administrator
	 */


	public static int Main()
	{
	 String str1 = new String(new char[1024]);
	 String str2 = new String(new char[1024]);
	 str1 = new Scanner(System.in).nextLine();
	 str2 = new Scanner(System.in).nextLine();
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: for(unsigned int i=0; i<strlen(str1); ++i)
	 for (int i = 0; i < str1.length(); ++i)
	 {
	  if ('a' <= str1.charAt(i) && str1.charAt(i) <= 'z') //???????
	  {
	   str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32); //???????????
	  }
	 }


	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: for( unsigned int j=0; j<strlen(str2); ++j)
	 for (int j = 0; j < str2.length(); ++j)
	 {
	  if ('a' <= str2.charAt(j) && str2.charAt(j) <= 'z') //???????
	  {
	   str2 = tangible.StringFunctions.changeCharacter(str2, j, str2.charAt(j) - 32); //???????????
	  }
	 }
		 if (strcmp(str1,str2) == 0)
		 {
			 System.out.print("=");
			 System.out.print("\n");
		 }
		 else if (strcmp(str1,str2) == 1)
		 {
			 System.out.print(">");
			 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print("<");
			 System.out.print("\n");
		 }
		 return 0;
	}
}

