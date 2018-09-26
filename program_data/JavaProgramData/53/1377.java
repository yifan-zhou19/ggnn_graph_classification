package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int k = 0;
		int j;
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
		}
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = i;j >= 0;j--)
			{
				if (a[i] == a[j])
				{
					k++;
				}
			}
			if (k == 1 && i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			if (k == 1 && i > 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}



}

