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
	for (i = 1;i <= n;i++)
	{

		if (!(i % 7 == 0 || (i - 7) % 10 == 0 || i / 7 == 10 || i == 78 || i == 79 || i == 77))
		{
			s = s + i * i;
		}

	}
	System.out.printf("%d",s);
	return 0;
	}

}

