package <missing>;

public class GlobalMembers
{
	public static int[] ss = new int[10000];
	public static int[] sz = new int[10000];
	public static int[] xiaoshi = new int[10000];
	public static int Main()
	{
	int i;
	int n;
	int hour = 0;
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
		ss[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		sz[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if ((ss[i]) >= 90 && (ss[i]) <= 140 && (sz[i]) >= 60 && (sz[i]) <= 90)
	{
		hour++;
		xiaoshi[i] = hour;
	}
		else
		{
		   hour = 0;
		}
	}
		int e;
		for (int k = 1;k <= n;k++)
		{
		   for (int i = 0;i < n - k;i++)
		   {
		   if (xiaoshi[i + 1] < xiaoshi[i])
		   {
		   e = xiaoshi[i + 1];
		   xiaoshi[i + 1] = xiaoshi[i];
		   xiaoshi[i] = e;
		   }
		   }
		}
		System.out.printf("%d",xiaoshi[n - 1]);
		return 0;
	}



}

