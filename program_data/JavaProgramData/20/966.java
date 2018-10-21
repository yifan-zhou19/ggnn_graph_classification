package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int t;
		String str = new String(new char[16]);
		char t_max;
		String substr = new String(new char[4]);
		while (scanf("%s%s", str, substr) != EOF)
		{
			l = str.length();
			t_max = -1;
			for (i = 0;i < l;i++)
			{
				if (t_max < str.charAt(i))
				{
					t = i;
					t_max = str.charAt(i);
				}
			}
			for (i = 0;i <= t;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",substr);
			for (;i < l;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}

}
