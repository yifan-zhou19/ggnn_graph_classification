package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5001];
		int[] b = new int[5001];
		int[] num = new int[10001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int x = 0;x < n;x++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[x] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[x] = Integer.parseInt(tempVar3);
			}
			for (int y = a[x];y <= b[x];y++)
			{
				num[y] = 1;
			}
		}
		int e;
		for (int k1 = 1;k1 <= n;k1++)
		{
			for (int i1 = 0;i1 < n - k1;i1++)
			{
				if (a[i1] > a[i1 + 1])
				{
					e = a[i1 + 1];
					a[i1 + 1] = a[i1];
					a[i1] = e;
				}
			}
		}
		for (int k2 = 1;k2 <= n;k2++)
		{
			for (int i2 = 0;i2 < n - k2;i2++)
			{
				if (b[i2] > b[i2 + 1])
				{
					e = b[i2 + 1];
					b[i2 + 1] = b[i2];
					b[i2] = e;
				}
			}
		}
		for (int m = 0;m < n - 1;m++)
		{
			if (b[m] == (a[m + 1] - 1))
			{
				System.out.print("no\n");
				return 0;
			}
		}
		for (int z = a[0];z <= b[n - 1];z++)
		{
			if (num[z] == 0)
			{
				System.out.print("no\n");
				break;
			}
			else
			{
				if (z == b[0])
				{
				  System.out.printf("%d %d",a[0],b[n - 1]);
				}
			}

		}



		return 0;
	}
}

