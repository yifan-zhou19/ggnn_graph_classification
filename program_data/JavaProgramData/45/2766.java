package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[52]);
		String b = new String(new char[55]);
		String c = new String(new char[52]);
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
	int i;
	int j;
	int k;
	int l;
	i = a.length();
	j = b.length() - i;
	for (k = 0;k <= j;k++)
	{
		for (l = k;l <= k + i - 1;l++)
		{
	c = tangible.StringFunctions.changeCharacter(c, l - k, b.charAt(l));
		}
	c = tangible.StringFunctions.changeCharacter(c, l - k, '\0');
	if (strcmp(a,c) == 0)
	{
	break;
	}
	}
	System.out.printf("%d",k);
	return 0;
	}
}

