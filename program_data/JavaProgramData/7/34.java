package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String t = new String(new char[256]);
	String s = new String(new char[256]);
	String r = new String(new char[256]);
	int lt;
	int ls;
	int i = 0;
	int j = 0;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		t = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		r = tempVar3.charAt(0);
	}
	lt = t.length();
	ls = s.length();
	while (i < lt && j < ls)
	{
	if (t.charAt(i) == s.charAt(j))
	{
	i++;
	j++;
	}
	else
	{
	j = j - i + 1;
	p = j;
	i = 0;
	}
	}
	if (i == lt)
	{
	for (i = 0;i < lt;i++)
	{
	s = tangible.StringFunctions.changeCharacter(s, i + p, r.charAt(i));
	}
	}
	System.out.printf("%s",s);
	return 0;
	}

}

