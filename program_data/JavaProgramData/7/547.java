package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String sub = new String(new char[256]);
		String re = new String(new char[256]);
		s = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		int i;
		int length;
		int lensub;
		int j;
		int k;
		int ans = 0;
		length = s.length();
		lensub = sub.length();
		for (i = 0;i < length;i++)
		{
			if (s.charAt(i) == sub.charAt(0))
			{
				for (j = 0;j < lensub;j++)
				{
					if (s.charAt(i + j) != sub.charAt(j))
					{
						break;
					}
				}
				if (j == lensub)
				{
					ans = 1;
					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",s.charAt(k));
					}
					System.out.printf("%s",re);
					for (k = i + lensub;k < length;k++)
					{
						System.out.printf("%c",s.charAt(k));
					}
					break;
				}
			}
		}
		if (ans != 1)
		{
			System.out.printf("%s",s);
		}
		return 0;
	}

}
