import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int x;
		while (a = new Scanner(System.in).nextLine()) //??
		{
		n = a.length();
		for (m = 0;m < n;m++)
		{
			System.out.print(a.charAt(m));
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == ')')
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == '(')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						break; //??????
					}
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			if (a.charAt(k) != '(' && a.charAt(k) != ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, k, ' ');
			}
			if (a.charAt(k) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, k, '$');
			}
			if (a.charAt(k) == ')')
			{
				a = tangible.StringFunctions.changeCharacter(a, k, '?');
			} //???????
		}
		for (m = 0;m < n;m++)
		{
			System.out.print(a.charAt(m));
		}
		System.out.print("\n");
		}
		return 0;
	}
}

