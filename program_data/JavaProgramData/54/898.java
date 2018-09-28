package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int monkey = new int(int,int);
		int m;
		int n;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		c = monkey(m, n);
		System.out.printf("%ld",c);
		return 0;
	}
	public static int monkey(int t,int k)
	{
		int i;
		int j;
		double[] g = new double[10000];
		g[0] = 1.5;
		for (j = 1;;j++)
		{
		g[t] = j;
		for (i = t;i >= 0;i--)
		{
		g[i - 1] = t * g[i] / (t - 1) + k;
		if (g[i - 1] != (int)g[i - 1])
		{
			break;
		}
		if (g[0] == (int)g[0])
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto sky;
		}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	sky:
		return ((int)g[0]);
	}
}

