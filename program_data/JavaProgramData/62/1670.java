package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		int i = 0;
		int j;
		int k = 0;
		int n = 0;
		int count = 0;
		int m;
		int ax = 0;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		while (a.charAt(n) != 0)
		{
			if (a.charAt(n) != ' ')
			{
				System.out.printf("%c", a.charAt(n));
			}
			if (a.charAt(n) == ' ')
			{
				for (i = n;i < m;i++)
				{
					if (a.charAt(i) == ' ')
					{
						count++;
					}
					if (a.charAt(i) != ' ')
					{
						break;
					}
				}
				System.out.print(" ");
				n += count - 1;
				count = 0;
			}
			n++;
		}
	}
}
