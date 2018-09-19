package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[N]);
		String b = new String(new char[N]);
		String c = new String(new char[N]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i = 0;
		while (i < a.length())
		{
			if (i == 0)
			{
				if (a.charAt(i) == b.charAt(0))
				{
					int j;
					for (j = 0;j < b.length();j++)
					{
						if (a.charAt(i + j) != b.charAt(j))
						{
							break;
						}
					}
					if (j == b.length())
					{
						System.out.printf("%s",c);
						i += b.length();
					}
					else
					{
						System.out.printf("%c",a.charAt(i));
						i++;
					}
				}
				else
				{
					System.out.printf("%c",a.charAt(i));
						i++;
				}
			}
			else
			{
				if (a.charAt(i) == b.charAt(0) && a.charAt(i - 1) == ' ')
				{
					int j;
					for (j = 0;j < b.length();j++)
					{
						if (a.charAt(i + j) != b.charAt(j))
						{
							break;
						}
					}
					if (j == b.length())
					{
						System.out.printf("%s",c);
						i += b.length();
					}
					else
					{
						System.out.printf("%c",a.charAt(i));
						i++;
					}
				}
				else
				{
					System.out.printf("%c",a.charAt(i));
					i++;
				}
			}
		}
		return 0;
	}
}
