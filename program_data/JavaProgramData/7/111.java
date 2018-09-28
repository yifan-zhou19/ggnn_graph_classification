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
		int x = 0;
		while (i < a.length())
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
				if (j == b.length() && x == 0)
				{
					System.out.printf("%s",c);
					x = 1;
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
		return 0;
	}
}
