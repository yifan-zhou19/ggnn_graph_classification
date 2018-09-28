package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[41]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		System.out.printf("%s",s);
		n--;
		c = s.length() + 1;
		while (n-- != 0)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			c += s.length();
			if (c > 80)
			{
				c = s.length() + 1;
				System.out.print("\n");
				System.out.printf("%s",s);
			}
			else
			{
				System.out.printf(" %s",s);
				c++;
			}
		}
	}


}

