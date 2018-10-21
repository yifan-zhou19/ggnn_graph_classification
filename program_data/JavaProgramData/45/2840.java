package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int l;
		int i;
		int k;
		int j;
		int m = 0;
		int d;
		int n;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(i) == ' ')
			{
				n = k = i;
				break;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k + 1;j < l;j++)
			{
				d = k + 1;
				if (s.charAt(i) == s.charAt(j))
				{
					k = j;
					m = m + 1;
					break;
				}
				else
				{
					m = 0;
					d = d + 1;
				}
			}
			if (m == n)
			{
				System.out.printf("%d",d - 2 * n);
				break;
			}
		}
		return 0;
	}

}
