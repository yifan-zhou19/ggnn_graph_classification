package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		final String mod = "abcdefghijklmnopqrstuvwxyz";
		int i;
		int l;
		int n;
		int t;
		int j;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < 26;i++)
		{
			n = 0;
			t = 100;
			for (j = l - 1;j >= 0;j--)
			{
				if (str.charAt(j) == mod.charAt(i))
				{
					t = i;
					n++;
				}
			}
			if (t != 100)
			{
			System.out.printf("%c=%d\n",mod.charAt(t),n);
			}
		}
		t = 0;
		for (j = 0;j < l;j++)
		{

			if (str.charAt(j) > 'a' && str.charAt(j) < 'z')
			{
				t++;
			}
		}
		if (t == 0)
		{
		System.out.print("No");
		}
		return 0;
	}

}
