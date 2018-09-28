package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}

	int[] shu = new int[1000];
	int shushu = 1;
	int test;
	test = m;

	for (;test <= n;test++)
	{

	int[] huiwen = new int[10];
	int i = 1;
	int k;
	int tester = test;
	for (i = 1;tester != 0;i++)
	{
	huiwen[i] = tester % 10;
	tester = tester / 10;
	k = i;
	}
	i = i - 1;
	int counter = 1;
	int testhuiwen = 0;
	for (i = k;i >= 1;i--)
	{
	testhuiwen = huiwen[i] * counter + testhuiwen;
	counter = counter * 10;
	}

	if (test == testhuiwen)
	{
		int yinzi = 2;
		for (;yinzi <= test;yinzi++)
		{
			if ((test % yinzi) != 0)
			{
				k = yinzi;
				continue;
			}
			else
			{
				break;
			}
		}
		if (yinzi == test)
		{
			shu[shushu] = test;
		shushu++;
		}
		else
		{
		}
	}
	else
	{
		continue;
	}
	}

	if (shu[1] == 0)
	{
		System.out.print("no");
	}
	else
	{
	int p = 1;
	for (;p < (shushu - 1);p++)
	{
		System.out.printf("%d,",shu[p]);
	}

	System.out.printf("%d",shu[p]);
	}




	return 0;
	}
}

