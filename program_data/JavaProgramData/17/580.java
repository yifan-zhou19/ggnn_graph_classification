import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void change(String b, int n, int m)
	{
		if (!b[m].equals(')') && m < n) //????
		{
			change(b, n, m + 1);
		}
		if (b[m].equals(')') && m < n)
		{
			int i;
			for (i = m;i >= 0;i--)
			{
				if (b[i].equals('('))
				{
					b[i] = 'A';
					b[m] = 'A';
					break;
				}
			}
			change(b, n, m + 1);
		}
	}
	public static int Main()
	{
		String a = new String(new char[200]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.in.read();
		while (a.charAt(0) != 0)
		{
		int num;
		int j;
		num = a.length();
		System.out.print(a);
		System.out.print("\n");
		change(a, num, 0);
		for (j = 0;j < num;j++) //?????
		{
			if (a.charAt(j) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '$');
			}
			else
			{
					if (a.charAt(j) == ')')
					{
				a = tangible.StringFunctions.changeCharacter(a, j, '?');
					}
				else
				{
				a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		a = new Scanner(System.in).nextLine();
		}
		return 0;
	}
}

