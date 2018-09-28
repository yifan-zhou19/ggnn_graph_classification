package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[266]);
		String a = new String(new char[266]);
		String b = new String(new char[266]);
		int i;
		int k;
		int j = 0;
		int c = 0;
		int d = 0;
		int p = 0;
		int mark = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zf = tempVar.charAt(0);
		}
		c = zf.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		d = a.length();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		for (i = 0;i < c;i++)
		{
			if (zf.charAt(i) == a.charAt(0))
			{
				for (k = 0;k < d;k++)
				{
					if (zf.charAt(i + k) == a.charAt(k))
					{
						j++;
						if (j == d)
						{
							p = i;
							mark = 1;
						}
					}
				}
			}
		}
		if (mark == 1)
		{
			for (i = 0;i < p;i++)
			{
				System.out.printf("%c",zf.charAt(i));
			}
			System.out.printf("%s",b);
			for (i = p + d;i < c;i++)
			{
				System.out.printf("%c",zf.charAt(i));
			}
		}
		if (mark == 0)
		{
			System.out.printf("%s",zf);
		}
		return 0;
	}



}

