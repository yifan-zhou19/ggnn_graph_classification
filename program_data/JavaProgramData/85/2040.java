package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
		String a = new String(new char[30]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la = a.length();
		int i;
		int count = 0;
		for (i = 0;i < la;i++)
		{
			if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9') || a.charAt(i) == '_')
			{
				count++;
			}
		}
		if (count != la || (a.charAt(0) >= '0' && a.charAt(0) <= '9'))
		{
			System.out.print("no");
			System.out.print("\n");
		}
		else
		{
			System.out.print("yes");
			System.out.print("\n");
		}
	}
		return 0;
	}

}

