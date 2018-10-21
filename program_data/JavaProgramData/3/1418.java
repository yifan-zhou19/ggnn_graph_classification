package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int j;
		int m;
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
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (m = 0;m < n;m++)
			{
				if ((a[j] + a[m]) == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if ((a[j] + a[m]) == k)
			{
					break;
			}
			else if (j == n - 1)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

