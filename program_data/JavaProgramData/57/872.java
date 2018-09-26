package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		int b;
		for (i = 0;i < n;i++)
		{
			String shuzu = new String(new char[40]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu = tempVar2.charAt(0);
			}
			b = shuzu.length();
			for (k = 0;k < b;k++)
			{
				if ((shuzu.charAt(k) == 'e' && shuzu.charAt(k + 1) == 'r' && shuzu.charAt(k + 2) == '\0') || (shuzu.charAt(k) == 'l' && shuzu.charAt(k + 1) == 'y' && shuzu.charAt(k + 2) == '\0') || (shuzu.charAt(k) == 'i' && shuzu.charAt(k + 1) == 'n' && shuzu.charAt(k + 2) == 'g' && shuzu.charAt(k + 3) == '\0'))
				{
					shuzu = tangible.StringFunctions.changeCharacter(shuzu, k, '\0');
				}
			}
			System.out.printf("%s\n",shuzu);
		}

		return 0;
	}
}

