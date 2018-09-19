package <missing>;

public class GlobalMembers
{
	public static int amount(char c, String a)
	{
		int i;
		int amount = 0;
		for (i = 0; !a[i].equals('\0');i++)
		{
			if (a[i].equals(c))
			{
				amount = amount + 1;
			}
		}
		return amount;
	}

	public static void match(String a)
	{
		int i;
		int j;
		int p;
		int q;
		p = amount('(', a);
		q = amount(')', a);

		for (i = 0; !a[i].equals('\0');i++)
		{
				if (a[i].equals('('))
				{
					for (j = i + 1; !a[j].equals('\0');j++)
					{
						if (a[j].equals('('))
						{
							break;
						}
						else if (a[j].equals(')'))
						{
							a[i] = ' ';
							a[j] = ' ';
							break;
						}
					}
				}
		}

		if (amount('(', a) < p || amount(')', a) < q)
		{
			return match(a);
		}

	}

	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		for (;scanf("%s",s) != EOF;)
		{
			System.out.printf("%s\n",s);
			match(s);
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (s.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}



}
