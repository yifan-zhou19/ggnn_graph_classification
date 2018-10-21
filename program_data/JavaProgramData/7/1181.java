import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************** 
	//*  ??: ???? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?12?24? 
	//***************************** 
	public static int Main()
	{
		int i;
		int j;
		int k;
		int flag = 0;
		String str = new String(new char[512]);
		String substr = new String(new char[256]);
		String replace = new String(new char[256]);
		str = new Scanner(System.in).nextLine();
		substr = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();
		int len1 = str.length();
		int len2 = substr.length();
		int len3 = replace.length();
		for (i = 0; i <= len1 - len2; i++)
		{
			 k = i;
			 for (j = 0; j < len2; j++)
			 {
				  if (str.charAt(k++) != substr.charAt(j))
				  {
					  break;
				  }
			 }
			 if (j == len2 && flag == 0)
			 {
				 int ii;
				 for (ii = i; ii < i + len3; ii++)
				 {
					  str = tangible.StringFunctions.changeCharacter(str, ii, replace.charAt(ii - i));
				 }
				 flag = 1;
			 }
		}
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}
}

