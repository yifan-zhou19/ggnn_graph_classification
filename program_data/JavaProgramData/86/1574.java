package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int k;
	int c;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n-- != 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	c = 0;
	while (m-- != 0)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	if (c + k < 60)
	{
	if (c + k + 3 < 60)
	{
	c += 3;
	}
	else
	{
	c = 60 - k;
	}
	}
	}
	System.out.printf("%d\n",60 - c);
	}
	return 0;
	}
}

