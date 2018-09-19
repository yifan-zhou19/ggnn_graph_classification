import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[101]);
	public static String bracket = new String(new char[101]);
	public static int len;
	public static void match(int a)
	{
		 if (a == len)
		 {
			 return;
		 }
		 int b = a - 1;
		 if (bracket.charAt(a) == '?')
		 {
			 while (bracket.charAt(b) == ' ')
			 {
				 if (b == 0)
				 {
					 match(a + 1);
					 return;
				 }
				 b--;
			 }
			 if (bracket.charAt(b) == '?')
			 {
				 match(a + 1);
				 return;
			 }
			 bracket = tangible.StringFunctions.changeCharacter(bracket, b, ' ');
			 bracket = tangible.StringFunctions.changeCharacter(bracket, a, ' ');
			 match(a + 1);
		 }
		 else
		 {
			 match(a + 1);
		 }
	}

	public static int Main()
	{
		while (str = new Scanner(System.in).nextLine())
		{
			len = str.length();
			for (int i = 0; i < len; i++)
			{
				if (str.charAt(i) == '(')
				{
					bracket = tangible.StringFunctions.changeCharacter(bracket, i, '$');
				}
				else if (str.charAt(i) == ')')
				{
					bracket = tangible.StringFunctions.changeCharacter(bracket, i, '?');
				}
				else
				{
					bracket = tangible.StringFunctions.changeCharacter(bracket, i, ' ');
				}
			}
			match(1);
			for (int i = 0; i < len; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
			for (int i = 0; i < len; i++)
			{
				System.out.print(bracket.charAt(i));
			}
			System.out.print("\n");
		}

		return 0;
	}



}

