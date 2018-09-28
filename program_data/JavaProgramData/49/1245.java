package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c1 = new String(new char[600]);
		String c2 = new String(new char[600]);
		int i;
		int j;
		int k;
		int l1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		l1 = c1.length();
		for (i = 2;i <= l1;i++)
		{
			for (j = 0;j <= l1 - i;j++)
			{
				for (k = 0;k < 600;k++)
				{
					c2 = c2.substring(0, k);
				}
				for (k = 0;k < i;k++)
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, k, c1.charAt(j + k));
				}

				for (k = 0;k < i / 2;k++)
				{
					if (c2.charAt(k) != c2.charAt(i - 1 - k))
					{
						break;
					}
				}
				if (k == i / 2)
				{
					System.out.printf("%s\n",c2);
				}
			}
		}
		return 0;
	}

}

