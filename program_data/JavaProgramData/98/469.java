package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int length = 0;
		String word = new String(new char[41]);
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
				word = tempVar2.charAt(0);
			}
			if (i == 0)
			{
				System.out.printf("%s",word),length = word.length();
			}
			else
			{
					length += (word.length() + 1);
					if (length > 80)
					{
						System.out.printf("\n%s",word),length = word.length();
					}
					else
					{
						System.out.printf(" %s",word);
					}
			}
		}
		return 0;
	}

}

