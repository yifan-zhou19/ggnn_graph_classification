package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] ss = new int[100];
	int[] sz = new int[100];
	int[] time = new int[100];
	int n;
	int t = 0;
	int i = 0;
	int a = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	time[0] = 0;
	while (t < n)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		ss[t] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		sz[t] = Integer.parseInt(tempVar3);
	}
	if (ss[t] >= 90 && ss[t] <= 140 && sz[t] >= 60 && sz[t] <= 90)
	{
	i += 1;
	a += 1;
	time[a] = i;
	}
	else
	{
	i = 0;
	}
	t++;
	}
	int s = 0;
	int max = 0;
	while (s <= a)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			time[s] = Integer.parseInt(tempVar4);
		}
	if (max < time[s])
	{
	max = time[s];
	}
	s++;
	}
	System.out.printf("%d",max);
	return 0;
	}

}

