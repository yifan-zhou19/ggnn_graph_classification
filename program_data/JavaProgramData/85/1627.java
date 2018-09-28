package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String sz = new String(new char[21]);
		for (int i = 0;i < n;i++)
		{
			c = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
			for (int j = 0;sz.charAt(j);j++)
			{
				if (!((sz.charAt(j) == '_') || (sz.charAt(j) >= 'A' && sz.charAt(j) <= 'Z') || (sz.charAt(j) >= 'a' && sz.charAt(j) <= 'z') || (sz.charAt(j) >= '0' && sz.charAt(j) <= '9' && j>0)))
				{
					c++;
				}
			}
			if (c != 0)
			{
				System.out.print("no\n");
			}
			if (c == 0)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

