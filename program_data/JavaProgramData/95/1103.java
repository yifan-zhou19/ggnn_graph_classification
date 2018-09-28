import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char i;
		char max;
		char t;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		t = 0;
		if (a.length() > b.length())
		{
			max = a.length();
		}
		else
		{
			max = b.length();
		}
		for (i = 0;i <= max - 1;i++)
		{
			if (a.charAt(i) >= 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) >= 97)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
			if (a.charAt(i) == b.charAt(i))
			{
				t = t + 1;
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				System.out.print('\n');
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				System.out.print('\n');
			}
		}
		if (t == max)
		{
			System.out.print("=");
			System.out.print('\n');
		}
		return 0;
	}
}

