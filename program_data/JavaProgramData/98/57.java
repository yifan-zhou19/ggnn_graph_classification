package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int linelen = 0;
		String words = new String(new char[40]);
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
					words = tempVar2.charAt(0);
				}
				if (linelen == 0)
				{
				x = words.length();
				}
				else
				{
				x = words.length() + 1;
				}
				if (linelen == 0)
				{
					System.out.printf("%s",words);
					linelen += x;
				}
				else if ((linelen + x) < 80)
				{
					System.out.printf(" %s",words);
					linelen += x;
				}
				else if ((linelen + x) == 80)
				{
					System.out.printf(" %s\n",words);
					linelen = 0;
				}
				else if ((linelen + x) > 80)
				{
					 System.out.printf("\n%s",words);
					 linelen = x;
					 linelen--;
				}
		}

		return 0;
	}

}

