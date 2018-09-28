package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void isHuiwen(char s0[500], int i);
		String str = new String(new char[500]);
		String s0 = new String(new char[500]);
		int i;
		int j;
		int k;
		int l;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 2;i < l;i++)
		{
			for (j = 0;j <= l - i;j++)
			{
				for (k = 0;k <= i;k++)
				{
					s0 = tangible.StringFunctions.changeCharacter(s0, k, str.charAt(k + j));
				}
				isHuiwen(s0, i);
			}
		}
		return 0;
	}
	public static void isHuiwen(String s0, int i)
	{
		int p;
		for (p = 0;p <= i / 2;p++)
		{
			if (!s0[p].equals(s0[i - 1 - p]))
			{
			return;
			}
		}
		for (p = 0;p < i;p++)
		{
			System.out.printf("%c",s0[p]);
		}
		System.out.print("\n");
		return;
	}
}

