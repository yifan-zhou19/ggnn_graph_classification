package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int flag = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		if (flag == 1)
		{
			System.out.print("yes\n");
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}
}

