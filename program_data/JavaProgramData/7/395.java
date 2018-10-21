package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String subString = new String(new char[256]);
		String replacement = new String(new char[256]);
		String result = new String(new char[256]);
		int L1;
		int L2;
		int L3;
		int i;
		int j;
		int t = 1;
		int flag = 0;
		int l;
		int m;
		int n;
		String = new Scanner(System.in).nextLine();
		subString = new Scanner(System.in).nextLine();
		replacement = new Scanner(System.in).nextLine();
		L1 = String.length();
		L2 = subString.length();
		L3 = replacement.length();
		for (i = 0;i < L1;i++)
		{
			for (j = 0;j < L2;j++)
			{
				if (subString.charAt(j) != string.charAt(j + i))
				{
					t = 0;
					break;
				}
			}

			if (t == 1)
			{
				for (l = 0;l < i;l++)
				{
					result = tangible.StringFunctions.changeCharacter(result, l, string.charAt(l));
				}
				m = 0;
				for (l = i;m < L3;l++,m++)
				{
					result = tangible.StringFunctions.changeCharacter(result, l, replacement.charAt(m));
				}
				for (n = i + L2;n < L1;n++,l++)
				{
					result = tangible.StringFunctions.changeCharacter(result, l, string.charAt(n));
				}
				result = tangible.StringFunctions.changeCharacter(result, l, '\0');
				flag = 1;
				break;
			}
			t = 1;
		}

		if (flag == 1)
		{
		System.out.printf("%s",result);
		}
		if (flag == 0)
		{
			System.out.printf("%s",String);
		}
		return 0;
	}
}

