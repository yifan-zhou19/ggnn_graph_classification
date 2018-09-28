package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[260]);
		String s2 = new String(new char[260]);
		String s3 = new String(new char[260]);
		int i;
		int j;
		int a = 0;
		int b;
		int c;
		int d;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		s3 = new Scanner(System.in).nextLine();
		c = s2.length();
		d = s1.length();
		for (i = 0;s1.charAt(i) != 0;i++)
		{
			if (s1.charAt(i) == s2.charAt(0))
			{
				for (j = 0;s2.charAt(j) != 0;j++)
				{
					if (s1.charAt(j + i) == s2.charAt(j))
					{
						a = 1;
					}
					else
					{
						a = 0;
						break;
					}
				}
			}
			if (a == 1)
			{
				b = i;
				break;
			}
		}
		if (a == 1)
		{
				for (i = 0;i < b;i++)
				{
					System.out.printf("%c",s1.charAt(i));
				}
				for (i = 0;s3.charAt(i) != 0;i++)
				{
					System.out.printf("%c",s3.charAt(i));
				}
				for (i = 0;i < d - b - c;i++)
				{
					System.out.printf("%c",s1.charAt(i + c + b));
				}
		}
		else
		{
			System.out.printf("%s",s1);
		}
		return 0;
	}

}
