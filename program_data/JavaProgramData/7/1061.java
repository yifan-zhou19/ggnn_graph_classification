package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int n = a.length();
		int m = b.length();
		int i;
		int j;
		for (int i = 0;i < n;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				for (j = 1;j < m;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
					break;
					}
				}
				if (j == m)
				{
					for (j = 0;j < m;j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
					}
					break;
				}
			}
		}
		System.out.println(a);
	}

}

