package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String sr = new String(new char[255]);
	int i;
	int j;
	int len;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char k;
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		k = tempVar2.charAt(0);
	}

	for (i = 0;i < n;i++)
	{
	sr = new Scanner(System.in).nextLine();
	len = sr.length();
	for (j = 0;j < len;j++)
	{
	if (sr.charAt(j) == 'A')
	{
	sr = tangible.StringFunctions.changeCharacter(sr, j, 'T');
	}
	else if (sr.charAt(j) == 'T')
	{
	sr = tangible.StringFunctions.changeCharacter(sr, j, 'A');
	}
	else if (sr.charAt(j) == 'C')
	{
	sr = tangible.StringFunctions.changeCharacter(sr, j, 'G');
	}
	else if (sr.charAt(j) == 'G')
	{
	sr = tangible.StringFunctions.changeCharacter(sr, j, 'C');
	}

	}
	System.out.printf("%s\n",sr);
	}
	return 0;
	}
}

