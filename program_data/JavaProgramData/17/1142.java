import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[101]);
	public static int find(String a, int b, int x)
	{
		int i;
		for (i = b; i < x; i++)
		{
			if (a[i + 1].equals('$'))
			{
				return 0;
			}
			if (a[i + 1].equals('?'))
			{
				a[i + 1] = ' ';
				a[b] = ' ';
				return 1;
			}
		}
		return 0;

	}

	public static int Main()
	{
		while (a = new Scanner(System.in).nextLine())
		{
			//cin.getline(a, 101);
			int x = a.length();
			int i;
			int[] l = new int[100];
			int t = 0;
			int temp;
			for (i = 0; i < x; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < x; i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
					l[t] = i;
					t++;
				}
				else if (a.charAt(i) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			for (i = 0; (i < t) && (i >= 0);)
			{
				if (a.charAt(l[i]) == ' ')
				{
					i++;
					continue;
				}
				temp = find(a, l[i], x);
				if (temp == 0)
				{
					i++;
				}
				if (temp == 1)
				{
					i = 0;
					continue;
				}
			}
			for (i = 0; i < x; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

