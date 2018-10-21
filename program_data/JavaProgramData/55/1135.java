package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int l;
		int i;
		int j;
		int m = 0;
		int t = 1;
		String s = new String(new char[100]);
		String p = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = s.length();
		for (i = l - 1;i >= 0;i--)
		{
		  if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A'+'0' + 10);
		  }
		  else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
		  {
			  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'0' + 10);
		  }
		  m = (s.charAt(i) - '0') * t + m;
		  t = t * a;
		}
		j = 0;
		for (i = 0;m > 0;i++)
		{
			p = tangible.StringFunctions.changeCharacter(p, i, m % b + '0');
			if ('9' < p.charAt(i))
			{
				p = tangible.StringFunctions.changeCharacter(p, i, p.charAt(i) + 'A'-'0' - 10);
			}
			m = m / b;
			j++;
		}
		if (i == 0)
		{
			System.out.print("0");
		}
		else
		{
						for (i = j - 1;i >= 0;i--)
						{
				   System.out.printf("%c",p.charAt(i));
						}
		}
		return 0;
	}

}

