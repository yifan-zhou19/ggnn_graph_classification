package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c1 = new String(new char[100]);
		String c2 = new String(new char[100]);
		int s1;
		int s2;
		int i;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		s1 = c1.length();
		s2 = c2.length();
		for (i = 0;i < s2;i++)
		{
			c = 0;
			if (c1.charAt(0) == c2.charAt(i))
			{
				c = 1;
				for (j = 1;j < s1;j++)
				{
					if (c1.charAt(j) != c2.charAt(i + j))
					{
						c = 0;
						break;
					}
				}
				if (c == 1)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
		return 0;
	}
}

