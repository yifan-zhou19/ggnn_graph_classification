package <missing>;

public class GlobalMembers
{
	public static void find(String a, int n, int m)
	{
		int i;
		if (!a[m].equals(')') && m < n)
		{
			find(a, n, m + 1);
		} //??????????
		if (a[m].equals(')') && m < n)
		{
			for (i = m;i >= 0;i--)
			{
				if (a[i].equals('('))
				{
					a[i] = ' ';
					a[m] = ' ';
					break;
				} //????????
			}
			find(a, n, m + 1); //????
		}
	}
	public static int Main()
	{
		int n;
		String a = new String(new char[200]);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //??
		{
		System.out.print(a);
		System.out.print("\n");
		n = a.length();
		find(a, n, 0); //????????
		for (int k = 0;k < n;k++)
		{
			if (a.charAt(k) == '(')
			{
				a = tangible.StringFunctions.changeCharacter(a, k, '$');
			} //???????
			else
			{
					if (a.charAt(k) == ')') //???????
					{
				a = tangible.StringFunctions.changeCharacter(a, k, '?');
					}
			else
			{
					if (a.charAt(k) != '(' && a.charAt(k) != ')') //?????????
					{
				a = tangible.StringFunctions.changeCharacter(a, k, ' ');
					}
			}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		}
		return 0;
	}
}

