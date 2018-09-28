import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str1 = new String(new char[100]);
		 String str2 = new String(new char[100]);
		 int i;
		 int flag = 1;
		 str1 = new Scanner(System.in).nextLine();

		 str2 = new Scanner(System.in).nextLine();
		 for (i = 0;str1.charAt(i) != '\0';i++)
		 {
			 if (str1.charAt(i) - 'a' >= 0 && str1.charAt(i) - 'z' <= 0)
			 {
				 str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 'a'+'A');
			 }

		 }
		  for (i = 0;str2.charAt(i) != '\0';i++)
		  {
			 if (str2.charAt(i) - 'a' >= 0 && str2.charAt(i) - 'z' <= 0)
			 {
				 str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 'a'+'A');
			 }

		  }
		  for (i = 0;str1.charAt(i) != '\0';i++)
		  {
			 if (str1.charAt(i) == str2.charAt(i))
			 {
				 continue;
			 }
			 else if (str1.charAt(i) < str2.charAt(i))
			 {
				 System.out.print('<');
			 flag = 0;
			 break;
			 }
			 else
			 {
				 System.out.print('>');
			 flag = 0;
			 break;
			 }
		  }
		  if (flag == 1)
		  {
			  System.out.print('=');
		  }

		  return 0;
	}



}

