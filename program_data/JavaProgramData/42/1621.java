package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int n;
		int k;
		int i;
		int j;
		int l;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		num = 0;
		for (i = 1;i <= n;i++)
		{
			if (a[i] != k)
			{
				num++;
			}
		}
			i = 1;
			j = 0;
			while (true)
			{
			if (j == num)
			{
				break;
			}
			if (a[i] == k)
			{
				for (l = i + 1;l <= n;l++)
				{
					a[l - 1] = a[l];
				}
				a[n] = k;
			}
			else
			{
				j++;
			i++;
			continue;
			}
			j = 0;
			i = 1;
			}
		for (i = 1;i <= num;i++)
		{
			if (i == num)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf("%d ",a[i]);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

