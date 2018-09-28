package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		String c = new String(new char[256]);
		final String d = "ATCG";
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
			l = c.length();
			for (j = 0;j < l;j++)
			{
				if (c.charAt(j) == d.charAt(0))
				{
					System.out.print("T");
				}
				if (c.charAt(j) == d.charAt(1))
				{
					System.out.print("A");
				}
				if (c.charAt(j) == d.charAt(2))
				{
					System.out.print("G");
				}
				if (c.charAt(j) == d.charAt(3))
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

