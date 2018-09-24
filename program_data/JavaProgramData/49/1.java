package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[600]);
	public static int Main()
	{
		int comp = new int(int sta,int lenx);
		int i;
		int j;
		int len;
		int p;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				if (comp(j, i) == 1)
				{
					for (p = j; p <= j + i - 1; p++)
					{
						System.out.printf("%c",s.charAt(p));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
	public static int comp(int sta,int lenx)
	{
		int i;
		int j;
		for (i = 1; i <= lenx / 2; i++)
		{
			if (s.charAt(sta + i - 1) != s.charAt(sta + lenx - i))
			{
				return (0);
			}
		}
		return (1);
	}
}
