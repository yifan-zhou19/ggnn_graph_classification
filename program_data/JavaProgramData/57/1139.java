package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] zfc = new char[50][33];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zfc[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < n;i++)
	{
	int len = 0;
	len = String.valueOf(zfc[i]).length();
	for (j = 0;j < len - 3;j++)
	{
	System.out.printf("%c",zfc[i][j]);
	}
	if (zfc[i][len - 3] == 'i' && zfc[i][len - 2] == 'n' && zfc[i][len - 1] == 'g')
	{
	System.out.print("\n");
	}
	if ((zfc[i][len - 2] == 'e' && zfc[i][len - 1] == 'r') || (zfc[i][len - 2] == 'l' && zfc[i][len - 1] == 'y'))
	{
		System.out.printf("%c\n",zfc[i][len - 3]);
	}
	else
	{
	System.out.print("\n");
	}
	}

		return 0;
	}
}

