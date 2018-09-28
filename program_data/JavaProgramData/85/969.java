package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[max + 1]);
		int i;
		int j;
		int n;
		int r = 0;
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
					if ((s.charAt(0) <= 'Z' && s.charAt(0) >= 'A') || (s.charAt(0) <= 'z' && s.charAt(0) >= 'a') || (s.charAt(0) == '_'))
					{
						  r++;
					}
				else
				{
					System.out.print("no\n");
					r = -1;
					break;
				}
				}
				else
				{
						if ((j != 0 && s.charAt(j) <= '9' && s.charAt(j) >= '0') || (j != 0 && s.charAt(j) <= 'Z' && s.charAt(j) >= 'A') || (j != 0 && s.charAt(j) <= 'z' && s.charAt(j) >= 'a') || (j != 0 && s.charAt(j) == '_'))
						{
						r++;
						}
				else
				{
					System.out.print("no\n");
					r = -1;
					break;
				}
				}
			}
			if (r == j)
			{
				System.out.print("yes\n");
			}
				r = 0;
		}

		return 0;
	}
}

