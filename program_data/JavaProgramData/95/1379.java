import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String char1 = new String(new char[100]);
		String char2 = new String(new char[100]);
		char1 = new Scanner(System.in).nextLine();
		char2 = new Scanner(System.in).nextLine();
		int i;
		int m = 0;
		int l1;
		int l2;
		l1 = char1.length();
		l2 = char2.length();
		if (l1 < l2)
		{
			;
		}
		l1 = l2;
		for (i = 0;i <= l1;i++)
		{
			if (char1.charAt(i) > 96)
			{
				char1 = tangible.StringFunctions.changeCharacter(char1, i, char1.charAt(i) - 32);
			}
			if (char2.charAt(i) > 96)
			{
				char2 = tangible.StringFunctions.changeCharacter(char2, i, char2.charAt(i) - 32);
			}
		}
		for (i = 0;i <= l1;i++)
		{
			if ((char1.charAt(i) > char2.charAt(i)) && ((char1.charAt(i) - char2.charAt(i)) != 32))
			{
				System.out.print(">");
				m = 1;
				break;
			}
			if ((char1.charAt(i) < char2.charAt(i)) && ((char2.charAt(i) - char1.charAt(i)) != 32))
			{
				System.out.print("<");
				m = 1;
				break;
			}


		}
		if (m == 0)
		{
		System.out.print("=");
		}

		return 0;
	}

}

