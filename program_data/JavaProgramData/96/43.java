package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		int i;
		int l;
		int t;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (t = 0,i = 0;i < l;i++)
		{
			t = t + s.charAt(i) - '0';
			a = tangible.StringFunctions.changeCharacter(a, i, t / 13 + '0');
			if (t >= 13)
			{
				t = t % 13 * 10;
			}
			else
			{
				t = t * 10;
			}
		}

		t = t / 10;
		a = a.substring(0, l);
		if (l == 1)
		{
			System.out.printf("%c\n%c\n",'0',s.charAt(0));
		}
		else if (l == 2 && (s.charAt(0) - '0') * 10 + s.charAt(1) - '0' < 13)
		{
			System.out.printf("%c\n%s\n",'0',s);
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) != '0')
				{
					p = a.charAt(i);
					break;
				}
			}
				System.out.printf("%s\n%d\n",p,t);
		}
	}

}

