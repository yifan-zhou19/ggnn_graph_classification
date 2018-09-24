import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int t;
		int j;
		int la;
		int k;
		int bb;
		int pp;
		while (a = new Scanner(System.in).nextLine())
		{
			System.out.print(a);
			System.out.print("\n");
			la = a.length();
			for (i = 0;i < la;i++)
			{
				if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			t = 0;
			while (t == 0)
			{
				t = 1;
				for (i = la - 1;i >= 0;i--)
				{
					if (a.charAt(i) == ')')
					{
						break;
					}
					if (a.charAt(i) == '(')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '$');
						break;
					}
				}
				for (i = 0;i < la;i++)
				{
					if (a.charAt(i) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?');
						break;
					}
					if (a.charAt(i) == '(')
					{
						break;
					}
				}
				for (i = 0;i < la;i++)
				{
					if (a.charAt(i) == '(')
					{
						for (j = i + 1;j < la;j++)
						{
							k = 2;
							if (a.charAt(j) == '(')
							{
								k = 0;
								break;
							}
							if (a.charAt(j) == ')')
							{
								k = 1;
								a = tangible.StringFunctions.changeCharacter(a, j, ' ');
								break;
							}
						}
						if (k == 1)
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						}
					}
				}
				for (i = 0;i < la;i++)
				{
					if (a.charAt(i) == '(' || a.charAt(i) == ')')
					{
						t = 0;
						break;
					}
				}
			}
			for (i = la - 1;i >= 0;i--)
			{
				if (a.charAt(i) != ' ')
				{
				break;
				}
			}
			bb = i;
			for (i = 0;i < la;i++)
			{
				if (a.charAt(i) != ' ')
				{
					break;
				}
			}
			pp = i;
			for (j = pp;j <= bb;j++)
			{
				System.out.print(a.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

