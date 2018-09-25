package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t = 0;
	int e = 0;
	int k;
	int a;
	int b;
	int[] an = new int[50];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (((a >= 90) && (a <= 140)) && ((b >= 60) && (b <= 90)))
	{
	an[t] = an[t] + 1;
	}
	else
	{
	t = t + 1;
	}
	}
	for (k = 1;k <= t + 1;k++)
	{
		for (i = 0;i < t + 1 - k;i++)
		{
			if (an[i] > an[i + 1])
			{
					e = an[i + 1];
					an[i + 1] = an[i];
					an[i] = e;
			}
		}
	}
	System.out.printf("%d\n",an[t]);
	return 0;
	}
}

