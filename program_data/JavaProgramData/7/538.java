package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		int m;
		String s = new String(new char[256]);
		String s1 = new String(new char[256]);
		String s2 = new String(new char[256]);
		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		a = s.length();
		b = s1.length();
		c = s2.length();
		for (i = 0;i < a;i++)
		{
			if (s.charAt(i) == s1.charAt(0))
			{
				for (j = 0;j < b;j++)
				{
					if (s.charAt(i + j) != s1.charAt(j))
					{
						break;
					}
				}
				if (s.charAt(i + b - 1) == s1.charAt(b - 1))
				{
					m = i;
					for (k = 0;k < m;k++)
					{
						System.out.printf("%c",s.charAt(k));
					}
						System.out.printf("%s",s2);
						for (k = i + b;k < a;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						break;
				}
			}
		}
		if (i == a)
		{
			System.out.printf("%s",s);
		}
	}


}
