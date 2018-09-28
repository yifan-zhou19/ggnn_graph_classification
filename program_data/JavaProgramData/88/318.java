package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[31]);
		int i;
		int u;
		n = new Scanner(System.in).nextLine();
		for (i = 0;i < n.length();i++)
		{
			if (n.charAt(i) <= '9' && n.charAt(i) >= '0')
			{
			System.out.printf("%c",n.charAt(i));
			u = 1;
			}
			else
			{
				if (u != 0)
				{
					System.out.print("\n");
				}
				u = 0;
			}
		}
		return 0;
	}

}
