package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[501]);
		s = new Scanner(System.in).nextLine();
		int i;
		int p;
		int q;
		int l;
		int n;
		int j;
		n = s.length();
		for (l = 1;l < n;l++)
		{
			for (i = 0;i < n - l;i++)
			{
				p = i;
				q = i + l;
				while (s.charAt(p) == s.charAt(q) && p < q)
				{
					p++;
					q--;
				}
				if (q <= p)
				{
					for (j = i;j <= i + l;j++)
					{
						System.out.printf("%c",s.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
			return 0;
	}
}
