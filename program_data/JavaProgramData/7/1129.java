package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int la;
		int i;
		int j;
		int lb;
		int lc;
		int h = 300;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		la = a.length();
		lb = b.length();
		lc = c.length();
		for (j = 0;j < la;j++)
		{
			if (b.charAt(0) == a.charAt(j))
			{
				for (i = 0;i < lb;i++)
				{
					if (b.charAt(i) != a.charAt(j + i))
					{
						break;
					}
				if ((i == lb - 1) && (b.charAt(i) == a.charAt(j + i)))
				{
					h = j;
					j = 100;
					break;
				}
				}
			}
		}
		if (h != 300)
		{
			for (p = h;p < h + lb;p++)
			{
				 a = tangible.StringFunctions.changeCharacter(a, p, c.charAt(0 + p - h));
			}
		}
		for (i = 0;i < la;i++)
		{
			 System.out.printf("%c",a.charAt(i));
		}


	}


}

