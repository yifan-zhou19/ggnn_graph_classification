package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] zfc = new char[n][256];
	String p;
	for (l = 0;l < n;l++)
	{
	zfc[l] = new Scanner(System.in).nextLine();
	}
	for (l = 0;l < n;l++)
	{
	for (p = zfc[l]; p != '\0';p++)
	{
	if (p == 'A')
	{
	p = 'T';
	}
	else if (p == 'T')
	{
	p = 'A';
	}
	else if (p == 'G')
	{
	p = 'C';
	}
	else
	{
	p = 'G';
	}
	}
	System.out.println(zfc[l]);
	}
	return 0;
	}
}

