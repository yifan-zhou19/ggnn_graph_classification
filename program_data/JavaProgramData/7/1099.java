package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		n = s.length() - b.length();
		for (i = 0;i <= n;i++)
		{
			m = 0;
			for (j = 0,k = i;j < b.length();j++,k++)
			{
				if (s.charAt(k) == b.charAt(j))
				{
					m++;
				}
			}
			if (m == b.length())
			{
				for (j = i,k = 0;j < b.length() + i;j++,k++)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, c.charAt(k));
				}
				break;
			}
		}
		System.out.println(s);


		return 0;
	}


}

