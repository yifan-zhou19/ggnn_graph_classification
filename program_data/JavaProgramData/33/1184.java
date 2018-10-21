package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


	int i = 0;
	int cnt = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s[i] = tempVar;
	}
	}

	for (int j = 0;j < n;j++)
	{
	for (i = 0;s[j][i] != '\0';i++)
	{
	if (s[j][i] == 'A')
	{
	System.out.print("T");
	}
	else if (s[j][i] == 'T')
	{
	System.out.print("A");
	}
	else if (s[j][i] == 'C')
	{
	System.out.print("G");
	}
	else if (s[j][i] == 'G')
	{
	System.out.print("C");
	}
	}
	System.out.print("\n");
	}

		return 0;
	}

}

