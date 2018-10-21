package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[55];
		int i;
		int l;
		int t;
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i <= l - 1;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				s[(int)(str.charAt(i)) - 68]++;
			}
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				s[(int)(str.charAt(i)) - 64]++;
			}
		}
		t = 0;
		for (i = 1;i <= 27;i++)
		{
			if (s[i] != 0)
			{
				System.out.printf("%c=%d\n",64 + i,s[i]);
				t = 1;
			}
		}
		for (i = 28;i <= 54;i++)
		{
			if (s[i] != 0)
			{
				System.out.printf("%c=%d\n",68 + i,s[i]);
				t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}
