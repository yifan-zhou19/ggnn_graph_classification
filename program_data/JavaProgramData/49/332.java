package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int i;
		int j;
		int k;
		int l;
		int t;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (j = 1;j < l;j++)
		{
			for (i = 0;i + j < l;i++)
			{
				for (k = 0;k <= j;k++)
				{
					if (s.charAt(i + k) == s.charAt(i + j - k))
					{
						t = 1;
					}
					else
					{
						t = 0;
						break;
					}
				}
				if (t == 1)
				{
					for (k = i;k <= i + j;k++)
					{
					System.out.printf("%c",s.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
