package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		String p;
		s = new Scanner(System.in).nextLine();
		p = s;
		int i;
		int j;
		int k;
		int l;
		int m;
		int t;
		l = s.length();
		for (i = 2;i <= l;i++)
		{
			for (j = 0;j < l - i + 1;j++)
			{
				int s = 0;
				for (t = 0;t < i / 2;t++)
				{
					if (*(p.Substring(j) + t) != *(p.Substring(j) + i - 1 - t))
					{
						s = 1;
						break;
					}
				}
				if (s == 0)
				{
					for (m = j;m < j + i;m++)
					{
						System.out.printf("%c",*(p.Substring(m)));
					}
						System.out.print("\n");
				}
			}

		}

		return 0;
	}
}
