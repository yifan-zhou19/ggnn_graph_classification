package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int L = 0;
		String word = new String(new char[25]);
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
			l = word.length();
			L += (l + 1);
			if (i == 0)
			{
				System.out.printf("%s",word);
			}
			else
			{
				if (L > 81)
				{
					L = l + 1;
				}
				if (L != (l + 1))
				{
					System.out.printf(" %s",word);
				}
				else
				{
					System.out.printf("\n%s",word);
				}
			}
		}
		return 0;
	}

}

