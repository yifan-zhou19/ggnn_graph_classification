package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[255]);
		String sub = new String(new char[255]);
		String rep = new String(new char[255]);
		String s = new String(new char[255]);
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		int len1 = str.length();
		int len2 = sub.length();
		int x = 0;
		int i;
		int j;
		int n;
		for (i = 0;i < len1 - len2 + 1;i++)
		{
			n = 0;
			for (j = 0;j < len2;j++)
			{
				if (str.charAt(i + j) != sub.charAt(j))
				{
					break;
				}
				else
				{
					n++;
				}
			}
			if (n == len2)
			{
				int m = 0;
				while (i + j + m < len1)
				{
					s = tangible.StringFunctions.changeCharacter(s, m, str.charAt(i + j + m));
					m++;
				}
				s = tangible.StringFunctions.changeCharacter(s, m, '\0');
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
				str += rep;
				str += s;
				System.out.println(str);
				x = 1;
				break;
			}
		}
		if (x == 0)
		{
			System.out.println(str);
		}
		return 0;
	}
}

