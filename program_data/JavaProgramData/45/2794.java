package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int x;
		int y;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		x = s.length();
		for (i = 0;i <= 49;i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				m = i;
				for (j = 1;j <= x - 1;j++)
				{
					if (w.charAt(m + 1) != s.charAt(j))
					{
						y = 0;
						break;
					}
					else
					{
						y = 1;
						m++;
					}
				}
			}
			if (y == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;

	}

}

