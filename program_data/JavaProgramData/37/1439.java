package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int l;
		int k;
		int m;
		String s = new String(new char[100000]);
		String a = new String(new char[26]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < t ; i++)
		{
			for (j = 0; j < 26 ; j++)
			{
			a = tangible.StringFunctions.changeCharacter(a, j, '1');
			}
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			m = s.length();
			a = tangible.StringFunctions.changeCharacter(a, 0, s.charAt(0));
			for (j = 1 ;j < m;j++)
			{
				k = 0;
				do
				{
					if (a.charAt(k) == '1')
					{
						break;
					}
					if (a.charAt(k) != s.charAt(j))
					{
						k++;
					}
					else
					{
						break;
					}
				}while (1 != 0);
				if (a.charAt(k) == '1')
				{
					a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(j));
				}
				else
				{
					for (l = k; l < 26 ; l++)
					{
						a = tangible.StringFunctions.changeCharacter(a, l, a.charAt(l + 1));
					}
				}
			}
			if (a.charAt(0) == '1')
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(a.charAt(0));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

