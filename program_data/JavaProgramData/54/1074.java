package <missing>;

public class GlobalMembers
{
	public static int f(int n, int k)
	{
		int nazou;
		int naqian;
		int i;
		int lastnazou;
		lastnazou = 1;
		nazou = lastnazou;
		for (i = 0;i < n - 1;i++)
		{
			if ((n * nazou + k) % (n - 1) == 0)
			{
			nazou = (n * nazou + k) / (n - 1);
			naqian = n * nazou + k;
			}
			else
			{
			lastnazou++;
			nazou = lastnazou;
			i = -1;
			}
		}
		return naqian;
	}
	public static int Main()
	{
	int n1;
	int k1;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k1 = Integer.parseInt(tempVar2);
	}
	m = f(n1, k1);
	System.out.printf("%d",m);
		return 0;
	}
}

