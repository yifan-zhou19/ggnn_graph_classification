package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[101]);
	a = new Scanner(System.in).nextLine();
	int l;
	int k;

	final String b = " \0";

	b += a;

	l = b.length();
	int i;
	int j;

	for (i = l;i >= 0;--i)
	{
		if (b.charAt(i) != '\0')
		{
			if (b.charAt(i) == ' ')
			{
				if (b.charAt(i + 1) != ' ')
				{
					for (j = i + 1;j <= k;j++)
					{
						System.out.printf("%c",b.charAt(j));
					}
				}
				if (i == 0)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.printf("%c",b.charAt(i));
				}

			}
			else if (b.charAt(i + 1) == ' ' || b.charAt(i + 1) == '\0')
			{
				k = i;
			}
		}

	}



	}
}
