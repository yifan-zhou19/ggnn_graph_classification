package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int a;
	int[] sh = new int[100000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n < 5)
	{
		System.out.print("empty");
		return 0;
	}
	for (i = 0;i < 100000;i++)
	{
		sh[i] = 0;
	}
	a = 1;
	sh[0] = 2;
	for (i = 3;i <= n;i++)
	{
		for (j = 2;j <= i;j++)
		{
			if (i % j == 0)
			{
				break;
			}
		}
		if (j == i)
		{
			sh[a] = i;
			a++;
		}
	}
	for (i = 0;i <= a;i++)
	{
		if (sh[i + 1] - sh[i] == 2)
		{
			System.out.printf("%d %d\n",sh[i],sh[i + 1]);
		}
	}
	return 0;
	}

}

