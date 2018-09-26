package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String sub = new String(new char[300]);
		String re = new String(new char[300]);
		int lenstr;
		int lensub;
		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		lenstr = str.length();
		lensub = sub.length();

		for (i = 0; i < lenstr; i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				for (j = i, k = 0; k < lensub; j++, k++)
				{
					if (str.charAt(j) != sub.charAt(k))
					{
						break;
					}
				}
				if (k == lensub)
				{
					for (j = i, k = 0; k < lensub; j++, k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, j, re.charAt(k));
					}
	break;
				}
			}
		}

		System.out.printf("%s", str);
		return 0;
	}
}

