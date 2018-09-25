package <missing>;

public class GlobalMembers
{
	public static int type(int m,int n)
	{
		int c;
		if (m == 1 || n == 1)
		{
	c = 1;
		}
	else if (m == 0 || n == 0)
	{
		c = 1;
	}
	else if (m < n)
	{
		c = type(m, m);
	}
	else
	{
		c = type(m, n - 1) + type(m - n, n);
	}
	return (c);
	}
	public static int Main()
	{
		int type = new int(int m,int n);
		int t;
		int[] M = new int[20];
		int[] N = new int[20];
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
	for (i = 0;i < t;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		M[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		N[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < t;i++)
	{
	System.out.printf("%d\n",type(M[i], N[i]));
	}
	return 0;
	}

}

