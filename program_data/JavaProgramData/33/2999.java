package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	c = System.in.read();
	for (i = 0;i < n;i++)
	{
	for (j = 0;;j++)
	{
	c = System.in.read();
	if (c == 'A')
	{
		System.out.print("T");
		continue;
	}
	if (c == 'C')
	{
		System.out.print("G");
		continue;
	}
	if (c == 'T')
	{
		System.out.print("A");
		continue;
	}
	if (c == 'G')
	{
		System.out.print("C");
		continue;
	}
	if (c == '\n')
	{
		System.out.print("\n");
		break;
	}


	}
	}
	}
}

