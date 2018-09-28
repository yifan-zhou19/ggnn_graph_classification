package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int[] s1 = new int[1001];
		int[] s2 = new int[1001];
		int i = 1;
		int j;
		int k = 0;
		int[] f = new int[1006];
		char c;
	while (true)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1[i] = Integer.parseInt(tempVar);
		}
		i++;
		if ((c = System.in.read()) == '\n')
		{
			break;
		}
	}
	n = i - 1;
	i = 0;
	while (true)
	{
		i++;
		if (i > n)
		{
			break;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2[i] = Integer.parseInt(tempVar2);
		}
		c = System.in.read();
	}
	for (i = 1;i <= n;i++)
	{
		for (j = s1[i];j < s2[i];j++)
		{
			f[j]++;
		}
	}

	for (i = 1;i <= 1000;i++)
	{
		k = (k > f[i])?k:f[i];
	}
	System.out.printf("%d %d\n",n,k);
	}
}

