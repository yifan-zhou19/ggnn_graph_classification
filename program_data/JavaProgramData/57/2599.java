package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int j;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	final String sz = "";
	int[] len = new int[50];
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz = tangible.StringFunctions.changeCharacter(sz, i, tempVar2);
	}
	len[i] = String.valueOf(sz.charAt(i)).length();
	}
	for (i = 0;i < m;i++)
	{
	p = len[i] - 2;
	if ((sz.charAt(i)[p] == 'e') && (sz.charAt(i)[p + 1] == 'r'))
	{
	sz.charAt(i)[p] = '\0';
	sz.charAt(i)[p + 1] = '\0';
	continue;
	}
	else if ((sz.charAt(i)[p] == 'l') && (sz.charAt(i)[p + 1] == 'y'))
	{
	sz.charAt(i)[p] = '\0';
	sz.charAt(i)[p + 1] = '\0';
	continue;
	}
	else if ((sz.charAt(i)[p - 1] == 'i') && (sz.charAt(i)[p] == 'n') && (sz.charAt(i)[p + 1] == 'g'))
	{
	sz.charAt(i)[p - 1] = '\0';
	sz.charAt(i)[p] = '\0';
	sz.charAt(i)[p + 1] = '\0';
	}
	}
	for (i = 0;i < m;i++)
	{
	System.out.println(sz.charAt(i));
	}
	return 0;
	}

}

