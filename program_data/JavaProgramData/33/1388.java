package <missing>;

public class GlobalMembers
{
	public static void dnapair(tangible.RefObject<String> str)
	{
	int p = 0;
	while (str.argValue.charAt(p) != '\0')
	{
	switch (str.argValue.charAt(p))
	{
	case'A':
	str.argValue.charAt(p++) = 'T';
	break;
	case'T':
	str.argValue.charAt(p++) = 'A';
	break;
	case'C':
	str.argValue.charAt(p++) = 'G';
	break;
	case'G':
	str.argValue.charAt(p++) = 'C';
	break;
	}
	}
	}
	public static int Main()
	{
	int n;
	String str = new String(new char[1221]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str = tempVar2.charAt(0);
	}
tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
	dnapair(tempRef_str);
	str = tempRef_str.argValue;
	System.out.printf("%s\n",str);
	}
	return 0;
	}

}

