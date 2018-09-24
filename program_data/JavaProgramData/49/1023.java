package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		int s = 0;
		String c = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
	k = c.length();
	for (i = 2;i <= k;i++)
	{
		for (j = 0;j <= k - i;j++)
		{
	for (l = 0;l <= i / 2 - 1;l++)
	{
	if (c.charAt(l + j) == c.charAt(j + i - l - 1))
	{
		m++;
	}
	}

	if (m == i / 2)
	{
		for (l = 0;l <= i - 1;l++)
		{
	System.out.printf("%c",c.charAt(j + l));
		}
	s++;
	}
	m = 0;
	if (s != 0)
	{
	System.out.print("\n");
	}
	s = 0;
		}

	}

	}
}

