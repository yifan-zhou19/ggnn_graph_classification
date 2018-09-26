package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[100]);
	String sub = new String(new char[100]);
	String rep = new String(new char[100]);
	int i;
	int j;
	int m;
	int len;
	int lens;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		sub = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		rep = tempVar3.charAt(0);
	}
	len = str.length();
	lens = sub.length();

	for (i = 0;i < len;i++)
	{
	if (str.charAt(i) == sub.charAt(0) && str.charAt(i + 1) == sub.charAt(1) && str.charAt(i + lens - 1) == sub.charAt(lens - 1))
	{
	j = i;
	m = 0;
	while (m < lens)
	{
	str = tangible.StringFunctions.changeCharacter(str, j, rep.charAt(m));
	j++;
	m++;
	}
	break;
	}
	}
	for (i = 0;i < len;i++)
	{
	System.out.printf("%c",str.charAt(i));
	}
	return 0;
	}




}

