package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		int b;
		int y;
		int w = 0;
		final String s1 = "";
		final String s2 = "";
		char e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;s1.charAt(i);i++)
		{
			if (s1.charAt(i) <= 'Z' && s1.charAt(i) >= 'A')
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'A'+'a');
			}
		}
		for (i = 0;s1.charAt(i);i++)
		{
			if (s1.charAt(i) <= 'z' && s1.charAt(i) >= 'a')
			{
				w = w * a + s1.charAt(i) - 'a' + 10;
			}
			else
			{
				w = w * a + s1.charAt(i) - '0';
			}
		}
	//	printf("%d\n",w);
		for (i = 0;1;i++)
		{
			y = w % b;
			if (y <= 9 && y >= 0)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, y + '0');
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, y - 10 + 'A');
			}
			w = w / b;
			if (w == 0)
			{
				break;
			}
		}
		w = s2.length();
		for (i = 0;i < w - i;i++)
		{
			e = s2.charAt(i);
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(w - i - 1));
			s2 = tangible.StringFunctions.changeCharacter(s2, w - i - 1, e);
		}
		System.out.printf("%s",s2);
	//	scanf("%d",&n);
		return 0;
	}

}

