package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc1 = new String(new char[1005]);
		String zfc2 = new String(new char[1005]);
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc2 = tempVar2.charAt(0);
		}
		for (i = 0;i < zfc1.length();i++)
		{
			for (j = 0;j < zfc1.length();j++)
			{
				if (zfc1.charAt(i) == zfc2.charAt(j))
				{
					for (k = i;k < zfc1.length();k++)
					{
						zfc1 = tangible.StringFunctions.changeCharacter(zfc1, k, zfc1.charAt(k + 1));
					}
					for (k = j;k < zfc2.length();k++)
					{
						zfc2 = tangible.StringFunctions.changeCharacter(zfc2, k, zfc2.charAt(k + 1));
					}
					j--;
					i--;
				}
			}
		}
		if (zfc1.length() == 0 && zfc2.length() == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc1 = tempVar3.charAt(0);
		}
		return 0;
	}


}

