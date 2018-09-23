import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		char temp;
		int i;
		int j;
		int l;
		int count = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		a = tangible.StringFunctions.changeCharacter(a, l, '.');
		for (i = 0; i <= l - 1; i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + ('A' - 'a'));
			}
		}
		temp = a.charAt(0);
		for (i = 0; i <= l; i++)
		{
			if (a.charAt(i) == temp)
			{
				count++;
			}
			if (a.charAt(i) != temp)
			{
				System.out.print("(");
				System.out.print(temp);
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				temp = a.charAt(i);
				count = 1;
			}
		}
		System.in.read();
		return 0;
	}
}

