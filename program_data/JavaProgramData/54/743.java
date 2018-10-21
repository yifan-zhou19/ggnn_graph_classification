package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int b;
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (j = 1;j < 2000000;j++)
		{
			b = j;
			a[n] = b * n + k;
			for (i = n;i >= 1;i--)
			{
				if ((n * a[i] + n * k - k) % (n - 1) == 0)
				{
					a[i - 1] = (n * a[i] + n * k - k) / (n - 1);
				}
				else
				{
					break;
				}
			}
			if (i <= 1)
			{
				break;
			}
		}
		System.out.printf("%d\n",a[1]);
		return 0;
	}



}

