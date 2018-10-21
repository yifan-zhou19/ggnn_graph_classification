package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int[] s = new int[100];
		int t;
		int total;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	t = 0;
	k = 0;
	total = 60;
	if (m != 0)
	{
	for (j = 0;j < m;j++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(s[j]) = Integer.parseInt(tempVar3);
		}
	}
	for (j = 0;j < m;j++)
	{
		t = s[j] + k;
		if (t > 60)
		{
			break;
		}
		if (t > 57)
		{
			total -= (60 - t);
			break;
		}
		if (t < 58)
		{
	total -= 3;
	k += 3;
		}

	}
	}
	System.out.printf("%d\n",total);
		}
	return 0;
	}
}

