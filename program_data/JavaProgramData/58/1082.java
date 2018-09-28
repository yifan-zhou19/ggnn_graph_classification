package <missing>;

public class GlobalMembers
{
	public static int no()
	{
		System.out.print(0);
		System.out.print("\n");
		return 0;
	}

	public static int yes()
	{
		System.out.print(1);
		System.out.print("\n");
		return 0;
	}


	public static int Main()
	{
		String s = new String(new char[300]);
		int i;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 1; k <= n; k++)
		{
			s = new Scanner(System.in).nextLine();
			if (!((s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || s.charAt(0) == '_'))
			{
				no();
				continue;
			}
			for (i = 0; s.charAt(i) != '\0'; i++)
			{
				if (!((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '_'))
				{
					no();
					break;
				}
			}
			if (s.charAt(i) == '\0')
			{
				yes();
			}
		}
		return 0;
	}

}

