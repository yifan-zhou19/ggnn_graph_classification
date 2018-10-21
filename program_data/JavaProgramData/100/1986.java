package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		char e;
		int i;
		int n;
		int zc;
		int x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		for (e = 'A';e <= 'Z';e++)
		{
			zc = 0;
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == e)
				{
					zc++;
					x = 0;
				}
			}
			if (zc != 0)
			{
				System.out.printf("%c=%d\n",e,zc);
			}
		}
		for (e = 'a';e <= 'z';e++)
		{
			zc = 0;
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) == e)
				{
					zc++;
					x = 0;
				}
			}
			if (zc != 0)
			{
				System.out.printf("%c=%d\n",e,zc);
			}
		}
		if (x != 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

