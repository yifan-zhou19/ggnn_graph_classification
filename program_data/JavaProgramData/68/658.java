package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int i;
		int t;
		t = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				t = 0;
				break;
			}
		}
		return (t);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= n / 2;j++)
			{
			if (ss(j) != 0 && ss(i - j) != 0)
			{
				System.out.printf("%d=%d+%d\n",i,j,i - j);
				break;
			}
			}
		}
	}
}

