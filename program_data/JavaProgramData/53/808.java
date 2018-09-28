package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10000];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (int k = 1;k < n;k++)
		{
			for (int m = 0;m < k;m++)
			{
				if (a[k] == a[m])
				{
					p = 1;
					break;
				}
			}
			if (p == 0)
			{
				System.out.printf(",%d",a[k]);
			}
			else
			{
					p = 0;
			}
		}
		return 0;
	}

}

