package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int m;
		int k;
		int N;
		int j;
		int p;
		int n = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		N = a.length() - b.length();
		p = b.length();
		for (k = 0;k <= N;k++)
		{
			m = 0;
			for (i = 0;i < 256;i++)
			{
				if (a.charAt(i + k) == b.charAt(i))
				{
					m++;
				}
				if (a.charAt(i + k) == '\0')
				{
					break;
				}
				if (b.charAt(i) == '\0')
				{
					break;
				}
				if (m >= p - 1)
				{
					break;
				}
			}


			if (m >= p - 1)
			{
				for (j = 0;j < k;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				for (j = 0;c.charAt(j) != '\0';j++)
				{
					System.out.printf("%c",c.charAt(j));
				}
				for (j = k + m + 1;a.charAt(j) != '\0';j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				 System.out.print("\0");
				 n = 1;
			}
			if (n == 1)
			{
			   break;
			}
		}

		if (n == 0)
		{
			System.out.printf("%s",a);
		}
		return 0;
	}

}
