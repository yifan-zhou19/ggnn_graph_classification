package <missing>;

public class GlobalMembers
{
	public static int isidentifor(String name)
	{
		String p = name;
		char ch = p;
		if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z') && (ch != '_'))
		{
			return 0;
		}
		for (p++; p != null; p++)
		{
			ch = p;
			if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z') && (ch != '_') && (ch < '0' || ch > '9'))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		String name = new String(new char[33]);
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}

			if (isidentifor(name) != 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

