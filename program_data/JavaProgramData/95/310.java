package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[81]);
		String k = new String(new char[81]);
		int x1;
		int x2;
		int i;
		s = new Scanner(System.in).nextLine();
		k = new Scanner(System.in).nextLine();
		x1 = s.length();
		x2 = k.length();
		if (s.length() == k.length())
		{
			for (i = 0;i < x1;i++)
			{
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
				{
					s.charAt(i) += 32;
				}
				if (k.charAt(i) >= 65 && k.charAt(i) <= 90)
				{
					k.charAt(i) += 32;
				}
			}
			if (strcmp(s,k) == 0)
			{
				System.out.print("=\n");
			}
			else if (strcmp(s,k) < 0)
			{
				System.out.print("<\n");
			}
			else if (strcmp(s,k) > 0)
			{
				System.out.print(">\n");
			}
		}
		else
		{
			for (i = 0;i < x1;i++)
			{
				if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
				{
					s.charAt(i) += 32;
				}
			}
			for (i = 0;i < x2;i++)
			{
				if (k.charAt(i) >= 65 && k.charAt(i) <= 90)
				{
					k.charAt(i) += 32;
				}
			}
			if (strcmp(s,k) == 0)
			{
				System.out.print("=\n");
			}
			else if (strcmp(s,k) < 0)
			{
				System.out.print("<\n");
			}
			else if (strcmp(s,k) > 0)
			{
				System.out.print(">\n");
			}
		}


		return 0;
	}

}
