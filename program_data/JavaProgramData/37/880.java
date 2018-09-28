package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[100]);
		int t;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			l = c.length();
			for (j = 0;j < l;j++)
			{
				for (k = 0;k < l;k++)
				{
					if (c.charAt(k) == c.charAt(j) && k != j)
					{
						break;
					}
				}
				if (k == l)
				{
					System.out.printf("%c\n",c.charAt(j));
					break;
				}
				if (j == l - 1)
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}


}

