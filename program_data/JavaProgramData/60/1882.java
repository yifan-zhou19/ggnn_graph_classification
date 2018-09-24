package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int K;
	int s;
	int[] a = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	k = 0;
	s = 0;
	for (i = 2;i <= n;i++)
	{
			for (j = 2;j <= i;j++)
			{
			if (i % j == 0)
			{
			break;
			}
			else
			{
				;
			}
			}

			if (i == j)
			{
				a[k] = i;
				k++;
			}
	}
	K = k;
	for (k = 0;k < K;k++)
	{
		if ((a[k + 1] - a[k]) == 2)
		{
		   System.out.printf("%d %d\n",a[k],a[k + 1]);
		s++;
		}
	}
	if (s == 0)
	{
	System.out.print("empty");
	}

	return 0;
	}
}

