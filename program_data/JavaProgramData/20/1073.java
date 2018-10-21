package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String sub = new String(new char[4]);
		char a;
		int i;
		int j;
		int b;
		for (i = 0;;i++)
		{
			if (scanf("%s %s",str,sub) == EOF)
			{
				break;
			}
			else
			{
				a = 0;
				b = 0;
				for (j = 0;j < str.length();j++)
				{
					if (str.charAt(j) > a)
					{
						a = str.charAt(j);
						b = j;
					}
				}
				for (j = 0;j <= b;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				System.out.printf("%s",sub);
				for (j = b + 1;j < str.length();j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
			}
			System.out.print("\n");
		}

		return 0;
	}

}
