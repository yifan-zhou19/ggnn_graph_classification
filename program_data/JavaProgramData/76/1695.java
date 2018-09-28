package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int m;
		int s;
		int[] a = new int[50000];
		int[] b = new int[50000];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
					m = b[j];
					b[j] = b[j + 1];
					b[j + 1] = m;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < a[i + 1])
			{
				s = 0;
				break;
			}
			else
			{
				if (b[i] < b[i + 1])
				{
					s = 1;
					continue;
				}
				else
				{
					b[i + 1] = b[i];
					s = 1;
					continue;
				}
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		return 0;
	}


}

