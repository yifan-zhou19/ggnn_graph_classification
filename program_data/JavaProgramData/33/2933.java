package <missing>;

public class GlobalMembers
{
	public static void match(char a)
	{
		if (a == 'A')
		{
			System.out.print("T");
		}
		if (a == 'T')
		{
			System.out.print("A");
		}
		if (a == 'C')
		{
			System.out.print("G");
		}
		if (a == 'G')
		{
			System.out.print("C");
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		String c = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		len = c.length();
		for (j = 0;j < len;j++)
		{
		match(c.charAt(j));
		}
		System.out.print("\n");
		}
		return 0;
	}

}

