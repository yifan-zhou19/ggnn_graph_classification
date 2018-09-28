package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int i;
		int j;
		int a;
		int k;
		int m;
		String sz = new String(new char[256]);
		String s1 = new String(new char[256]);
		String r = new String(new char[256]);
		String zj = new String(new char[256]);
		sz = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		r = new Scanner(System.in).nextLine();
		l1 = sz.length();
		l2 = s1.length();
		for (i = 0;i < l1;i++)
		{
			if (sz.charAt(i) == s1.charAt(0))
			{
				a = 0;
				for (j = 0;j < l2;j++)
				{
					if (s1.charAt(j) == sz.charAt(i + j))
					{
						a = a + 1;
					}
				}
				if (a == l2)
				{
							  for (m = 0;m < i;m++)
							  {
									 System.out.printf("%c",sz.charAt(m));
							  }
							  System.out.printf("%s",r);
							  for (m = i + l2;m < l1;m++)
							  {
							  System.out.printf("%c",sz.charAt(m));
							  }
							  k = 1;

				}
			}
			if (k == 1)
			{
				break;
			}
		}
			if (k != 1)
			{
				System.out.printf("%s",sz);
			}

		return 0;
	}

}
