package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz = tempVar.charAt(0);
		}
		int i;
		int j;
		int m;
		int n;
		int len;
		int len1;
		int len2;

		String as = new String(new char[100]);
		String az = new String(new char[100]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			as = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			az = tempVar3.charAt(0);
		}

		len = sz.length();
		len1 = as.length();
		len2 = as.length();
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < len2;j++,i++)
			{
				if (sz.charAt(i) != as.charAt(j))
				{
					break;
				}
				if (j == len2 - 1)
				{
					for (m = i - len2 + 1,n = 0;n < len2;n++,m++)
					{
						sz = tangible.StringFunctions.changeCharacter(sz, m, az.charAt(n));
					}
				}
				if (j == len2 - 1)
				{
					i = len;
				}
			}
		}
		System.out.printf("%s",sz);
		return 0;
	}


}

