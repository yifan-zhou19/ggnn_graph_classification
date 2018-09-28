package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	String chm = new String(new char[257]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = 0;

	while (i < n)
	{
	for (j = 0;j < 257;j++)
	{
	chm = tangible.StringFunctions.changeCharacter(chm, j, '\0');
	}
	chm = new Scanner(System.in).nextLine();
	for (j = 0;j < 257;j++)
	{
	if (chm.charAt(j) == 'T')
	{
	System.out.print("A");
	}
	if (chm.charAt(j) == 'A')
	{
	System.out.print("T");
	}
	if (chm.charAt(j) == 'C')
	{
	System.out.print("G");
	}
	if (chm.charAt(j) == 'G')
	{
	System.out.print("C");
	}
	}
	System.out.print("\n");
	i++;
	}

	}
}

