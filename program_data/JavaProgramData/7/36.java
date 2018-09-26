package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz1 = new String(new char[256]);
		String sz2 = new String(new char[256]);
		String sz3 = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz3 = tempVar3.charAt(0);
		}
		int len1;
		int len2;
		len1 = sz1.length();
		len2 = sz2.length();
		int i;
		int k;
		int flag = 0;
		for (k = 0;k <= len1 - len2;k++)
		{
			for (i = 0;i < len2;i++)
			{
				if (sz1.charAt(i + k) == sz2.charAt(i))
				{
					   flag = flag + 1;

				}

			}
			if (flag == len2)
			{
			break;
			}
			if (flag != len2)
			{
				flag = 0;
			}
		}
		if (flag == len2)
		{
			for (i = 0;i < len2;i++)
			{
				sz1 = tangible.StringFunctions.changeCharacter(sz1, k + i, sz3.charAt(i));
			}

		}
		System.out.printf("%s",sz1);
		return 0;
	}
}

