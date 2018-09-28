package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int flag = 0;
		int n;
		int k;
		int[] a = new int[10000];
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
		for (i = 0;i < n;i++)
		{
			if (i == 1)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (k == a[i] + a[j])
				{
					flag = 1;
				}
			}
		}
		if (flag == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}

}

