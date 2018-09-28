package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		String c = new String(new char[257]);
		final String d = "";
		final String e = "";
		int i;
		int m = 0;
		int j;
		int t;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
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
		for (i = 0;;i++)
		{
			if (a.charAt(i) == '\0' || b.charAt(m) == '\0')
			{
				break;
			}
			if (b.charAt(m) != a.charAt(i))
			{
				m = 0;
				continue;
			}
			m++;
		}
		if (m != 0)
		{
			  for (j = 0,t = 0;j <= i - m;j++,t++)
			  {
				if (j == i - m)
				{
					d = tangible.StringFunctions.changeCharacter(d, t, '\0');
				}
				else
				{
					d = tangible.StringFunctions.changeCharacter(d, t, a.charAt(j));
				}
			  }
			len = a.length();
			if (i != len)
			{
				for (j = i,t = 0;j < len;j++,t++)
				{
					e = tangible.StringFunctions.changeCharacter(e, t, a.charAt(j));
				}
				d += c;
				 d += e;
			}
			else
			{
				d += c;
			}
			System.out.printf("%s",d);
		}
		else
		{
			System.out.printf("%s",a);
		}
		 return 0;
	}


}

