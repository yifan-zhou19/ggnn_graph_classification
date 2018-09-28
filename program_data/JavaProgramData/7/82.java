package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String re = new String(new char[256]);
		int i;
		int k = 0;
		int j = 0;
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		int n = str.length();
		int m = sub.length();
		for (i = 0;i < n;i++)
		{
			if (sub.charAt(k) == str.charAt(i))
			{
				k++;
			}
			else
			{
				k = 0;
				if (sub.charAt(k) == str.charAt(i))
				{
					k++;
				}
			}
			if (k == m)
			{
				for (j = 0;j < m;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i + j - m + 1, re.charAt(j));
				}
				break;
			}
		}
		System.out.printf("%s\n",str);
		return 0;
	}
}

