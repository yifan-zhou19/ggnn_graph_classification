package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int jn = 0;
		int mid;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] shuzu = new int[n];
	int[] jishu = new int[n];
	for (int i1 = 0;i1 < n;i1++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		shuzu[i1] = Integer.parseInt(tempVar2);
	}
	if (shuzu[i1] % 2 == 1)
	{
	jn = jn + 1;
	jishu[jn] = shuzu[i1];
	for (int i2 = jn;i2 > 1;i2--)
	{
		if (jishu[i2] < jishu[i2 - 1])
		{
	mid = jishu[i2 - 1];
	jishu[i2 - 1] = jishu[i2];
	jishu[i2] = mid;
		}

	}
	}
	}
	for (int i3 = 1;i3 < jn;i3++)
	{
	System.out.printf("%d,",jishu[i3]);
	}
	System.out.printf("%d",jishu[jn]);
	return 0;
	}

}

