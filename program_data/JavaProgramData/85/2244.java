package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int j;
		String s = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			c = 0;
			j = 0;
			if ((s.charAt(0) == '_') || ('a' <= s.charAt(0) && s.charAt(0) <= 'z') || ('A' <= s.charAt(0) && s.charAt(0) <= 'Z'))
			{
				for (j = 1;s.charAt(j) != '\0';j++)
				{
					if (('0' <= s.charAt(j) && s.charAt(j) <= '9') || (s.charAt(j) == '_') || ('a' <= s.charAt(j) && s.charAt(j) <= 'z') || ('A' <= s.charAt(j) && s.charAt(j) <= 'Z'))
					{
						c++;
					}
				}
				if (c == j - 1)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		else
		{
			System.out.print("no\n");
		}
		}

			return 0;
	}


}

