package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[20005];
		int del;
		int j;
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
		for (i = 1;i <= n;i++)
		{
			del = a[i];
			if (a[i] >= 10)
			{
				if (i == 1)
				{
					System.out.printf("%d",a[1]);
				}
				else
				{
					System.out.printf(" %d",a[i]);
				}
			}
			for (j = i + 1;j <= n;j++)
			{
				if (a[j] == a[i])
				{
					a[j] = 0;
				}
			}
		}
	}
}

