package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		String s = new String(new char[550]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 1;i <= l / 2;i++)
		{
			for (j = i - 1;j <= l - 1 - i;j++)
			{
				if (s.charAt(j) == s.charAt(j + 1))
				{
					for (k = 1;k <= i - 1;k++)
					{
						if (s.charAt(j - k) != s.charAt(j + 1 + k))
						{
							break;
						}
					}
					if (k > i - 1)
					{
						for (k = j + 1 - i;k <= j + i;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}
