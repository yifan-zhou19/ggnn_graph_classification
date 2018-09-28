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
	int[][] a = new int[300][2];
	int i;
	for (i = 0;i < 300;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][1] = Integer.parseInt(tempVar2);
	}
	if (a[i][0] == 0)
	{
		break;
	}
	else
	{
		System.out.printf("%d\n",f(a[i][1], a[i][0]) + 1);
	}
	}
	return 0;
	}


}

