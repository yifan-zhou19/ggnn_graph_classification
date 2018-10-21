import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str1 = new String(new char[85]);
	 String str2 = new String(new char[85]);
	 str1 = new Scanner(System.in).nextLine();
	 str2 = new Scanner(System.in).nextLine();
	 int l = Math.max(str1.length(), str2.length());
	 for (int i = 0;i < l;i++)
	 {
			 if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
			 {
				 str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			 }
			 if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90)
			 {
				 str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			 }

			 if (str1.charAt(i) > str2.charAt(i))
			 {
					System.out.print('>');
			 return 0;
			 }
			 else if (str1.charAt(i) < str2.charAt(i))
			 {
			 System.out.print('<');
			 return 0;
			 }
			 else if (str1.charAt(i) == str2.charAt(i))
			 {
				 continue;
			 }

	 }
	System.out.print('=');

	  return 0;

	}
}

