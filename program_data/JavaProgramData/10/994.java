package <missing>;

public class GlobalMembers
{
	public static int[] p;
	public static int n;
	public static int max(int t,int k)
	{
		if (t > k)
		{
			return t;
		}
		else
		{
			return k;
		}
	}
	public static int pd(int i,int h)
	{
		if (i == n)
		{
			return 0;
		}
		if (p[i] > h)
		{
			return pd(i + 1, h);
		}
		if (p[i] == h)
		{
			return pd(i + 1, h) + 1;
		}
	   return max(pd(i + 1, p[i]) + 1, pd(i + 1, h));
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[i] = Integer.parseInt(tempVar2);
		}
		}
		k = pd(0, 800000);
		System.out.printf("%d",k);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
	}

}

