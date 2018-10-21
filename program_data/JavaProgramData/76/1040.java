package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int m;
		int i;
		int t;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
		m = 0;
			for (i = n - 1;i > 0;i--)
			{
				for (j = 0;j < i;j++)
				{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
				}
			}
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] >= a[i + 1])
			{
				if (b[i] > b[i + 1])
				{
					b[i + 1] = b[i];
				}
					if (i + 2 == n)
					{
					m = 1;
					}
			}
			if (b[i] < a[i + 1])
			{
				break;
			}
		}
			if (m != 1)
			{
				System.out.print("no");
			}
			else
			{
				System.out.printf("%d %d",a[0],b[i]);
			}
			return 0;
	}

}

