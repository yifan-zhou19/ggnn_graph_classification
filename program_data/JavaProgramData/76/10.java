package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int j;
		int max = 0;
		int min = 10000;
		int x;
		int flag = 0;
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
		for (j = 0;j < n;j++)
		{
			for (i = n - 1;i > j;i--)
			{
				if (a[i] < a[i - 1])
				{
					x = a[i];
					a[i] = a[i - 1];
					a[i - 1] = x;
					x = b[i];
					b[i] = b[i - 1];
					b[i - 1] = x;
				}
			}
		}
		for (j = 1;j < n;j++)
		{
			flag = 0;
			for (i = 0;i < j;i++)
			{
				if (b[i] >= a[j])
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] < min)
				{
					min = a[i];
				}
				if (b[i] > max)
				{
					max = b[i];
				}
			}
			System.out.printf("%d %d\n",min,max);
		}
		return 0;
	}

}

