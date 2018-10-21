package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001];
		int n;
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
		num = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (a[j] == a[i])
				{
				a[i] = 0;
				num++;
				break;
				}
			}
		}
		j = 0;
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 0)
			{
			j++;
			if (j != n - num)
			{
			System.out.printf("%d ",a[i]);
			}
			else
			{
				System.out.printf("%d",a[i]);
			break;
			}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

