package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[100]);
		char n = ')';
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		while (true)
		{
			a = new Scanner(System.in).nextLine();
			if (feof(stdin))
			{
				break;
			}
			k = 0;
			while (true)
			{
				n = ')';
				m = 0;
			for (i = 0;i < 200;i++)
			{
				if (a.charAt(i) == '\0')
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto here;
				}
				l = 0;
				for (j = 0;j < k;j++)
				{
					if (i == b.charAt(j))
					{
						l = 1;
						break;
					}
				}
				if (l != 0)
				{
					continue;
				}
				else if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					continue;
				}
				else if (n == '(' && a.charAt(i) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, k, m);
					b = tangible.StringFunctions.changeCharacter(b, k + 1, i);
					k = k + 2;
					break;
				}
				m = i;
				n = a.charAt(i);
			}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	here:
			System.out.printf("%s\n",a);
			for (i = 0;i < 200;i++)
			{
				if (a.charAt(i) == '\0')
				{
					System.out.print("\n");
					break;
				}
				m = 0;
				for (j = 0;j < k;j++)
				{
					if (i == b.charAt(j))
					{
						m = 1;
						break;
					}
				}
				if (m == 1)
				{
					System.out.print(" ");
				}
				else if (a.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (a.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

