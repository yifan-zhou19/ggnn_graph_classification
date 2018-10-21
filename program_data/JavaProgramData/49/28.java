package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		int i = 0;
		int j;
		int l;
		int k;
		int m;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (j = 0;j <= i;j++)
		{
			for (i = 0;i + j + 1 < l;i++)
			{
				for (k = 0;k <= j;k++)
				{
					if (s.charAt(i - k) != s.charAt(i + 1 + k))
					{
						break;
					}
				}
				if (k == j + 1)
				{
					for (m = 0;m < (j + 1) * 2;m++)
					{
					System.out.printf("%c",s.charAt(i - j + m));
					}
					System.out.print("\n");
				}
				if (i == l - 1)
				{
					break;
				}
			}
		}
		return 0;
	}
}
