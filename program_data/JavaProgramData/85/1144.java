package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");

		while (n-- != 0)
		{
			String str = new String(new char[21]);
			str = new Scanner(System.in).nextLine();
			int i;
			char a = str.charAt(0);
			if (!((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a == '_')))
			{
				System.out.println("no");
				continue;
			}

			for (i = 1;i < str.length();i++)
			{
				a = str.charAt(i);
				if (!((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a == '_') || (a >= '0' && a <= '9')))
				{
					System.out.println("no");
					break;
				}
			}

			if (i >= str.length())
			{
				System.out.println("yes");
			}
		}

		return 0;
	}
}

