package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] HalaMadrid = new int[10000];
		int[] BeatFCBarcelona = new int[10000];
		int n;
		int[] t = new int[1000];
		int max = 0;
		int i;
		int j;
	for (i = 0;i < 10000;i++)
	{
	HalaMadrid[i] = -1;
	}
	for (i = 0;i < 10000;i++)
	{
	BeatFCBarcelona[i] = -1;
	}
	for (i = 0;i < 10000;i++)
	{
	if (i == 0)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		HalaMadrid[i] = Integer.parseInt(tempVar);
	}
	}
	else
	{
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			HalaMadrid[i] = Integer.parseInt(tempVar2);
		}
	}
	}
	for (i = 0;i < 10000;i++)
	{
	if (i == 0)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		BeatFCBarcelona[i] = Integer.parseInt(tempVar3);
	}
	}
	else
	{
		String tempVar4 = ConsoleInput.scanfRead(",");
		if (tempVar4 != null)
		{
			BeatFCBarcelona[i] = Integer.parseInt(tempVar4);
		}
	}
	}
	for (i = 0;HalaMadrid[i] != -1;i++)
	{
		;
	}
	n = i;
	for (i = 0;i < 1000;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (i + 0.5 >= HalaMadrid[j] != 0 && i + 0.5 < BeatFCBarcelona[j])
			{
				t[i]++;
			}
		}
	}
	for (i = 0;i < 1000;i++)
	{
		if (max < t[i])
		{
			max = t[i];
		}
	}
	System.out.printf("%d %d\n",n,max);
		return 0;
	}

}

