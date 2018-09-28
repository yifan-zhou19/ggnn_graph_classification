package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] q = new int[100000];
		int[] w = new int[100000];
	int i;
	int j;
	int k;
	int l;
	int m;
	int n;
	int a;
	int b;
	int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	k = 0;
	for (i = 3;i <= n;i++)
	{
		for (j = 2;j <= i - 1;j++)
		{
			if (i % j == 0)
			{
				break;
			}

			if (j == i - 1)
			{
				k = k + 1;
				q[k] = w[k] = i;
			}
		}
	}


		for (l = 1;l <= n;l++)
		{
			for (m = l;m <= n;m++)
			{
				if (n == q[l] + w[m])
				{
					System.out.printf("%d %d\n",q[l],w[m]);
				}
			}
		}
	}

}

