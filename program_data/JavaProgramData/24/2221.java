package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[10000]);
		int i;
		int j;
		int m = 0;
		int n = 0;
		int l;
	s = new Scanner(System.in).nextLine();
	l = s.length();
	for (i = 0;i <= l - 1;i++)
	{
		if (((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) || ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')))
		{
		for (j = i;j <= l - 1;j++)
		{
			if (((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z')) || ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')))
			{
				if (j != l - 1)
				{
					continue;
				}
		else
		{
			if ((j - i + 1) > (m - n))
			{
				m = j + 1;
				n = i;
			}
			i = j;
			break;
		}
			}
		else
		{
			if ((j - i) > (m - n))
			{
				m = j;
				n = i;
			}
			i = j - 1;
			break;
		}
		}
		}
	}
	for (i = n;i <= m - 1;i++)
	{
		System.out.printf("%c",s.charAt(i));
	}
	System.out.print("\n");
	m = 100;
	n = 0;
	for (i = 0;i <= l - 1;i++)
	{
		if (((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) || ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')))
		{
		for (j = i;j <= l - 1;j++)
		{
			if (((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z')) || ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')))
			{
				if (j != l - 1)
				{
					continue;
				}
		else
		{
			if ((j - i + 1) < (m - n))
			{
				m = j + 1;
				n = i;
			}
			i = j;
			break;
		}
			}
		else
		{
			if ((j - i) < (m - n))
			{
				m = j;
				n = i;
			}
			i = j - 1;
			break;
		}
		}
		}
	}
	for (i = n;i <= m - 1;i++)
	{
		System.out.printf("%c",s.charAt(i));
	}
	System.out.print("\n");

	}

}
