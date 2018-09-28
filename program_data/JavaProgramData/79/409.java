package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[301];
	int[] b = new int[301];
	int[] n = new int[300];
	int[] m = new int[300];
	int c = 0;
	int i;
	int j;
	int k;
	int t;
	for (i = 1;i <= 300;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		if (n[i] == 0 && m[i] == 0)
		{
			break;
		}
		c = c + 1;
	}
	for (k = 1;k <= c;k++)
	{
		for (i = 1;i <= n[k];i++)
		{
			a[i] = i;
		}
		while (n[k] > 1)
		{
			t = m[k] % n[k];
			for (j = 1;j <= t;j++)
			{
				b[j] = a[j];
			}
			for (j = t + 1;j <= n[k];j++)
			{
				a[j - t] = a[j];
			}
			for (j = 1;j <= t;j++)
			{
				a[n[k] - t + j] = b[j];
			}
			n[k]--;
		}
	System.out.printf("%d\n",a[1]);
	}
	}

}

