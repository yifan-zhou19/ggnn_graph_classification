package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int l = a.length();
		int t;
		char temp;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
		}
		for (i = 0;i < l;i++)
		{
			t = 0;
			for (j = i;;j++)
			{
				if (a.charAt(j) == a.charAt(i))
				{
					t = t + 1;
				}
				else
				{
					break;
				}
			}
			 temp = a.charAt(i);
			System.out.print('(');
			System.out.print(temp);
			System.out.print(',');
			System.out.print(t);
			System.out.print(')');
			i = i + t - 1;
		}
		return 0;
	}

}

