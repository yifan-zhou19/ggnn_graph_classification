package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		char[][] ci = new char[256][256];
		int ls;
		int la;
		int lb;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ls = s.length();
		la = a.length();
		lb = b.length();
		int i;
		int j;
		for (i = 0;i <= ls - la;i++)
		{
			for (j = 0;j < la;j++)
			{
				ci[i][j] = s.charAt(i + j);
			}
				ci[i][la] = '\0';
		}
		for (i = 0;i <= ls - la;i++)
		{
			if (strcmp(ci[i],a) == 0)
			{
				ci[i] = b;
				break;
			}
		}
		if (i != ls - la + 1)
		{
			for (j = 0;j < i;j++)
			{
				System.out.printf("%c",ci[j][0]);
			}
			System.out.printf("%s",ci[i]);
			if (i != ls - la)
			{
				for (j = i + la;j < ls - la;j++)
				{
					System.out.printf("%c",ci[j][0]);
				}
				System.out.printf("%s",ci[ls - la]);
			}
		}
		else
		{
			for (j = 0;j < ls - la;j++)
			{
				System.out.printf("%c",ci[j][0]);
			}
			System.out.printf("%s",ci[ls - la]);
		}
		return 0;
	}

}
