package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int len;
		int j;
		int a = 0;
		int b = 1;
		String zfc = new String(new char[100]);
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
				zfc = tempVar2.charAt(0);
			}
			len = zfc.length();
			for (a = 0;a < len;a++)
			{
				for (j = a + 1;j < len;j++)
				{
					if (zfc.charAt(a) == zfc.charAt(j))
					{
						b = 0;
						zfc = tangible.StringFunctions.changeCharacter(zfc, j, '0');
						break;
					}
					else if (zfc.charAt(a) != '0')
					{
						b = 1;
					}
				}
				if (b == 1)
				{
					break;
				}
				else if (a == len)
				{
					b = 0;
					break;
				}
			}
			if (b == 1)
			{
				System.out.printf("%c\n",zfc.charAt(a));
			}
			else
			{
				System.out.print("no");
			}
		}

		return 0;
	}

}

