package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int c;
	int a;
	int T;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	T = 0;

	for (i = 1;i <= n;i++)
	{
		if (i > 70)
		{
			a = i - 70;
		}
			else
			{
				a = 70 - i;
			}
		c = i - 7;
	if (i % 7 != 0 && c % 10 != 0 && i / 10 != 7)
	{
		T = T + i * i;
	}

	}
	System.out.printf("%d\n",T);

	return 0;
	}
}

