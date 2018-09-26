package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int b;
	int[] sz = new int[100];
	int[] s = new int[100];
	int[] z = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int a = 0;
	int k = 0;
	for (int k = 0;k < 100;k++)
	{
	z[k] = 0;
	}
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s[i] = Integer.parseInt(tempVar3);
		}
		if (sz[i] <= 140 && sz[i] >= 90 && s[i] <= 90 && s[i] >= 60)
		{
			z[k]++;
		}
		else
		{
		k++;
		}
	}
	for (int k = 0;k < 100;k++)
	{
		if (z[k] > z[k + 1])
		{
			b = z[k + 1];
			z[k + 1] = z[k];
			z[k] = b;
		}
	}
	System.out.printf("%d",z[99]);
	return 0;
	}
}

