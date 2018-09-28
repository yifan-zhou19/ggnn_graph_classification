package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		int len;
		int len0;
		int m;
		int n;
		int i;
		int j;
		int f = 0;
		s = new Scanner(System.in).nextLine();
		len0 = s.length();
		for (len = 2;len <= len0;len++)
		{
			for (i = 0;i < len0 - len + 1;i++)
			{
				j = i + len - 1;
				m = i;
				n = j;
				while (s.charAt(m) == s.charAt(n) && m <= i + len / 2 - 1)
				{
					m++;
					n--;
				}
				if (m == i + len / 2)
				{
					for (m = i;m <= j;m++)
					{
						System.out.printf("%c",s.charAt(m));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
