package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String sb = new String(new char[1000]);
	String dsb = new String(new char[1000]);
	for (int i = 0;i < n;i++)
	{

	for (l = 0;l < 1000;l++)
	{
	sb = tangible.StringFunctions.changeCharacter(sb, l, '\0');
	dsb = tangible.StringFunctions.changeCharacter(dsb, l, '\0');
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sb = tempVar2.charAt(0);
	}
	for (k = 0;sb.charAt(k) != '\0';k++)
	{
	if (sb.charAt(k) == 'A')
	{
	dsb = tangible.StringFunctions.changeCharacter(dsb, k, 'T');
	}
	else if (sb.charAt(k) == 'T')
	{
	dsb = tangible.StringFunctions.changeCharacter(dsb, k, 'A');
	}
	else if (sb.charAt(k) == 'C')
	{
	dsb = tangible.StringFunctions.changeCharacter(dsb, k, 'G');
	}
	else if (sb.charAt(k) == 'G')
	{
	dsb = tangible.StringFunctions.changeCharacter(dsb, k, 'C');
	}
	}
	System.out.printf("%s\n",dsb);
	}
	return 0;
	}

}

