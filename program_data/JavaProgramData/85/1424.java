package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[21]);
		int n;
		int j;
		int i;
		int c = 0;
		int l;
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
				s = tempVar2.charAt(0);
			}
			l = s.length();
			for (j = 1;j < l;j++)
			{
				if ((s.charAt(j) == '_') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
				{
					c++;
				}
			}
			if ((s.charAt(0) == '_') || (s.charAt(0) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(j) <= 'Z'))
			{
				c++;
			}
			if (c == l)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			c = 0;
		}
		return 0;
	}
}

