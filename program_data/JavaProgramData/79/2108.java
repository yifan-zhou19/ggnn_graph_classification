package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	int i;
	int k = 0;
	for (i = 2;i <= n;i++)
	{
	k = ((m % i) + k) % i;
	}
	return k;
	}
	public static int Main()
	{
	int m;
	int n;
	int[] c = new int[300];
	int d;
	int j;
	for (j = 0;j > -1;j++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (m == 0)
	{
		d = j;
		break;
	}
	c[j] = f(m, n) + 1;
	}

	for (j = 0;j < d;j++)
	{
		System.out.printf("%d\n",c[j]);
	}

	return 0;
	}
}

