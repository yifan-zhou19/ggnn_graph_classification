package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 0;i <= n;i++)
	{
	s = s + i * i;

	if (i % 7 == 0 || i % 10 == 7 || i > 69 && i < 80)
	{
	s = s - i * i;
	}
	}
	System.out.printf("%d",s);
	return 0;
	}
}

