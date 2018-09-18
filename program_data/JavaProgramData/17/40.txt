import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		while (true)
		{
		a = new Scanner(System.in).nextLine();
		if (a.charAt(0) == 0)
		{
			break;
		}
		System.out.print(a);
		System.out.print("\n");
		int i;
		int j = 0;
		int k;
		int l;
		int d;
		for (i = 0;i < a.length();i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, ' ');
		}
		b = b.substring(0, i);
		for (i = 0;i < a.length();i++)
		{
			if (j == 0 && a.charAt(i) == ')')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '?');
			}
			else if (a.charAt(i) == ')')
			{
				j--;
				for (k = i;k >= 0;k--)
				{
					if (b.charAt(k) == '$')
					{
						b = tangible.StringFunctions.changeCharacter(b, k, ' ');
						break;
					}
				}
			}
			else if (a.charAt(i) == '(')
			{
				j++;
				b = tangible.StringFunctions.changeCharacter(b, i, '$');
			}
		}
		for (d = 0;d < a.length();d++)
		{
			if (b.charAt(d) != ' ')
			{
				break;
			}
		}
		for (i = 0;i < a.length();i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + d));
		}
		for (l = (a.length() - 1 - d);l >= 0;l--)
		{
			if (b.charAt(l) != ' ')
			{
				break;
			}
		}
			b = b.substring(0, l + 1);
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}
}

