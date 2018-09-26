package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int l;
	int a;
	int sum = 0;
	int f = 0;
	int[] m = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead("""");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		m[i] = a;
	}
	for (j = 1;j <= n;j++)
	{
		for (l = j;l <= n;l++)
		{
			sum = m[j] + m[l];
		if (sum == k)
		{
			f = f + 1;
		}
		else
		{
			f = f;
		}
		}
	}
	if (f == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.print("yes");
	}
	return 0;
	}


}

