package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String s = new String(new char[20]);
		int i;
		int j;
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
			for (j = 0;s.charAt(j);j++)
			{
				if (j == 0)
				{
					if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || s.charAt(j) == '_')
					{
				   m = 1;
					}
				else
				{
					m = 0;
				break;
				}
				}
				else
				{
					if ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9') || s.charAt(j) == '_')
					{
				m = 1;
					}
				else
				{
					m = 0;
				break;
				}
				}
			}
			if (m == 1)
			{
				System.out.print("yes\n");
			}
			if (m == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

