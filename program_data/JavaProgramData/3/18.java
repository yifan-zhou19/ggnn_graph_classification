package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int ib = 1;
		int[] a = new int[1000];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (ib != 0)
			{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
				ib = 0;
				break;
				}
				if ((i == n - 2) && (a[i] + a[j] != k))
				{
					System.out.print("no");
				}
			}
			}
		}
	}

}

