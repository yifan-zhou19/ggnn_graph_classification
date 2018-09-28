package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String zi = new String(new char[256]);
		String r = new String(new char[256]);
		int lens;
		int lenzi;
		int lenr;
		int i;
		int k;
		int p = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			zi = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			r = tempVar3.charAt(0);
		}
		lens = s.length();
		lenzi = zi.length();
		lenr = r.length();
		for (i = 0;i < lens;i++)
		{
			if (s.charAt(i) == zi.charAt(0))
			{
				for (k = 1;k < lenzi;k++)
				{
					if (s.charAt(i + k) == zi.charAt(k))
					{
						p = 0;
					}
					else
					{
						break;
					}
				}
				if (p == 0)
				{
					for (k = 0;k < lenzi;k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, i + k, r.charAt(k));
					}
					System.out.printf("%s",s);
					break;
				}
			}
		}
			 if (p == 2)
			 {
			System.out.printf("%s",s);
			 }
		return 0;
	}
}

