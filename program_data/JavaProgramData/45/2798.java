package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int m;
		int n;
		int i;
		int j;
		int x = 0;
		m = a.length();
		n = b.length();
		for (j = 0;j < n;j++)
		{
			if (a.charAt(0) == b.charAt(j))
			{
				for (i = 0;i < m;i++)
				{
					if (i == m - 1 && a.charAt(i) == b.charAt(i + j))
					{
						x = 1;
					}
					if (a.charAt(i) == b.charAt(i + j))
					{
						continue;
					}
					else if (a.charAt(i) != b.charAt(i + j))
					{
						break;
					}
				}
			}
			if (x == 1)
			{
				System.out.printf("%d",j);
				break;
			}
		}
		return 0;
	}
}

