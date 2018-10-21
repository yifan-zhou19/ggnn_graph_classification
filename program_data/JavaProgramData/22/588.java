package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i = 1;
		int j;
		int k;
		int[] a = new int[301];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", a[i]))
		{
			i++;
		}
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < i - j - 1;k++)
			{
				if (a[k] > a[k + 1])
				{
					n = a[k];
					a[k] = a[k + 1];
					a[k + 1] = n;
				}
			}
		}
		for (j = i - 1;j >= 0;j--)
		{
			if (a[j] > a[j - 1])
			{
				break;
			}
		}
		if (j == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",a[j - 1]);
		}
		return 0;
	}

}

