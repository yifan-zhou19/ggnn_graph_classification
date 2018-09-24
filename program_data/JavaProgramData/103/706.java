package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
	int i;
	int j;
	int p;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	for (i = 0;;i++)
	{
		if (s.charAt(i) == '\0')
		{
	break;
		}

	 else if (s.charAt(i) >= 'a')
	 {
		s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
	 }
	}
	for (q = 0;q < i;)
	{
		j = q;
		p = 1;
	for (;;j++)
	{
		if (s.charAt(j + 1) == s.charAt(j))
		{
		p = p + 1;
	continue;
		}
	else
	{
		break;
	}
	}
	q = q + p;
	System.out.printf("(%c,%d)",s.charAt(j),p);
	}
	}



}

