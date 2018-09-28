package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[50010];
	public static int[] b = new int[50010];

	public static int _ins(int temp,int j)
	{
		if (a[j] > temp)
		{
			return -1;
		}
		return b[j] > temp != 0?b[j]:temp;
	}


	public static int Main()
	{
		int n;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (int k = 1;k < n;k++)
		{
			for (int i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
					f = b[i + 1];
					b[i + 1] = b[i];
					b[i] = f;
				}
			}
		}

		int temp = b[0];

		for (int j = 1;j <= n - 1;j++)
		{
			if ((temp = _ins(temp, j)) == -1)
			{
				break;
			}
		}

		if (temp == -1)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",a[0],temp);
		}

		return 0;
	}
}

