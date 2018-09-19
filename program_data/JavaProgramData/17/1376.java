import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int j = 0;
		String a = new String(new char[150]);
		String b = new String(new char[150]);
		while (b = new Scanner(System.in).nextLine())
		{
		l = b.length();
		for (i = 0; i < l; i++)
		{
			System.out.print(b.charAt(i));
			if (b.charAt(i) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(i)); //???????????????
			}
			else if (b.charAt(i) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(i));
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
		}
		System.out.print("\n");
		if (a.charAt(l - 1) == '(')
		{
			a = tangible.StringFunctions.changeCharacter(a, l - 1, '$');
		}
		for (i = l - 1; i >= 0; i--) //????????
		{
			if (a.charAt(i) == '(') //?????????????????
			{
				for (j = i + 1 ; j < l ; j++)
				{
					if (a.charAt(j) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						break;
					}
				}
				if (j == l)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$'); //??????????????????$
				}
			}
		}
		for (i = 0; i < l; i++)
		{
			if (a.charAt(i) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '?'); //????????????
			}
		}
		for (i = 0; i < l; i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");
		}
		return 0;
	}
}

