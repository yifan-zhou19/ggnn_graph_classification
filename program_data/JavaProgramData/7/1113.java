package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		int alen;
		int blen;
		int clen;
		int i;
		int j;
		alen = a.length();
		blen = b.length();
		clen = c.length();
		int n = 0;
		for (i = 0;i < blen;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				n = 1;
				for (j = 0;j < alen;j++)
				{
					if (a.charAt(j) != b.charAt(i + j))
					{
					n = 2;
					break;
					}
				}
			}
			if (n == 1)
			{
				break;
			}
		}
		int t = i;
		if (n == 1)
		{
		for (i = 0;i < t;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		System.out.printf("%s",c);
		for (i = t + clen;i < blen;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		}
		else
		{
			System.out.printf("%s",b);
		}
		return 0;
	}

}

