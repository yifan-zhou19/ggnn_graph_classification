package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int z = 0;
		int zm = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] <= 140 && a[i] >= 90 && b[i] >= 60 && b[i] <= 90)
			{
				z++;
				if (i == n - 1)
				{
					if (z > zm)
					{
					zm = z;
					}
				}
			}
			else
			{
				if (z > zm)
				{
					zm = z;
				}
				z = 0;
			}
		}
		System.out.printf("%d",zm);
		return 0;
	}

}

