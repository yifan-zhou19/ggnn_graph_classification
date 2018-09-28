package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int shifouchuxian;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (int i = 1;i < n;i++)
		{
			shifouchuxian = 0;
			for (int j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					shifouchuxian += 1;
				}
			}
			if (shifouchuxian == 0)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}

}

