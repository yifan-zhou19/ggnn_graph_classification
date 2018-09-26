package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int sign;
		int l;
		String s = new String(new char[550]);

		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 2;i <= l;i++)
		{
			for (j = 0;j < l;j++)
			{
				sign = 0;
				for (k = j;k < j + i;k++)
				{
					if (s.charAt(k) == s.charAt(j + i - 1 - k + j))
					{
						sign++;
					}
				}
				if (sign == i)
				{
					for (k = j;k < j + i;k++)
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
