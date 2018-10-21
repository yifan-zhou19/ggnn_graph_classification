package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		int l1;
		int l2;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l1;i++)
		{
			if (b.charAt(i) != a.charAt(0))
			{
				continue;
			}
			else
			{
				for (j = i;j <= i + l2 - 1;j++)
				{
					if (a.charAt(j - i) != b.charAt(j))
					{
						break;
					}
				}
				if (j > i + l2 - 1)
				{
					break;
				}
			}
		}
		System.out.printf("%d",i);
		return 0;
	}
}

