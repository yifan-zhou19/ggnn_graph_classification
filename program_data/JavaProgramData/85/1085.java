package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int a;
		String s = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			for (j = 0;j < len;j++)
			{
				if ((s.charAt(j) == '_') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j>0))
				{
					a++;
				}
			}
			if (a < len)
			{
				System.out.print("no\n");
			}
			if (a == len)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

