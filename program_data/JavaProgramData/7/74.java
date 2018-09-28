package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[p]);
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int m;
		int x = 0;
		String a = new String(new char[p]);
		a = new Scanner(System.in).nextLine();
		String b = new String(new char[p]);
		b = new Scanner(System.in).nextLine();
		i = a.length();
		for (j = 0;s.charAt(j) != '\0';j++)
		{
			if (a.charAt(0) == s.charAt(j))
			{
				for (k = 1;k < i;k++)
				{
					if (a.charAt(k) != s.charAt(j + k))
					{
						break;
					}
				}
			}
			if (k == i)
			{
				for (m = 0;m < j;m++)
				{
					System.out.printf("%c",s.charAt(m));
				}
				System.out.printf("%s",b);
				for (m = i + j;s.charAt(m) != '\0';m++)
				{
					System.out.printf("%c",s.charAt(m));
				}
				x = 1;
				break;
			}
		}
		if (x == 0)
		{
			System.out.printf("%s",s);
		}
		return 0;
	}

}
