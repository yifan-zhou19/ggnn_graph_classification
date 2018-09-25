package <missing>;

public class GlobalMembers
{
	public static void pipei(String x, int l)
	{
		int i;
		int j;
		int count;
		for (;count != 0;)
		{
			count = 0;
			for (i = 0;i < l;i++)
			{
				if (!x[i].equals('('))
				{
					continue;
				}
				for (j = i + 1;j < l;j++)
				{
					if (!x[j].equals('(') && !x[j].equals(')'))
					{
						continue;
					}
					if (x[j].equals('('))
					{
						break;
					}
					if (x[j].equals(')'))
					{
						count++;
						x[i] = 32;
						x[j] = 32;
						break;
					}
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			if (!x[i].equals('(') && !x[i].equals(')'))
			{
				System.out.print(" ");
			}
			else if (x[i].equals('('))
			{
				System.out.print("$");
			}
			else
			{
				System.out.print("?");
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		String x = new String(new char[101]);
		int l;
		int i;
		for (;;)
		{
			x = new Scanner(System.in).nextLine();
			if (x.charAt(0) == '\0')
			{
				break;
			}
			l = x.length();
			System.out.println(x);
			pipei(x, l);
			for (i = 0;i < l;i++)
			{
				x = tangible.StringFunctions.changeCharacter(x, i, '\0');
			}
		}
	}
}

