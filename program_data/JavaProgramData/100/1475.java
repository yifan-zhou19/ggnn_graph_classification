package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		int tag = 0;
		int i;
		int n;
		int j;
		int m;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
		if ((((int)s.charAt(i) >= 65) && ((int)s.charAt(i) <= 90)) || (((int)s.charAt(i) >= 97) && ((int)s.charAt(i) <= 122)))
		{
			tag = 1;
		}
		}
		if (tag == 0)
		{
			System.out.print("No");
		}
		for (j = 65;j < 91;j++)
		{
			m = 0;
			for (i = 0;i < n;i++)
			{
				if ((int)s.charAt(i) == j)
				{
					m = m + 1;
				}
			}
			if (m != 0)
			{
				System.out.printf("%c=%d\n",j,m);
			}
		}
		for (j = 97;j < 123;j++)
		{
			m = 0;
			for (i = 0;i < n;i++)
			{
				if ((int)s.charAt(i) == j)
				{
					m = m + 1;
				}
			}
			if (m != 0)
			{
				System.out.printf("%c=%d\n",j,m);
			}
		}
	}

}
