package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int f;
		int l;
		int k;
		String s1 = new String(new char[260]);
		String s2 = new String(new char[260]);
		String s3 = new String(new char[260]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		m = s1.length();
		n = s2.length();
		l = s3.length();
		for (i = 0;i < m;i++)
		{
			f = 1;
			for (j = 0;j < n;j++)
			{
				if (s1.charAt(i + j) != s2.charAt(j))
				{
					f = 0;
					break;
				}
			}
			if (f == 1)
			{
					k = i;
					break;
			}
		}
		if (f == 0)
		{
			System.out.println(s1);
		}
		else
		{
			for (i = 0;i < k;i++)
			{
				System.out.printf("%c",s1.charAt(i));
			}
			for (i = 0;i < l;i++)
			{
				System.out.printf("%c",s3.charAt(i));
			}
			for (i = k + l;i < m;i++)
			{
				System.out.printf("%c",s1.charAt(i));
			}
		}
		return 0;
	}
}
