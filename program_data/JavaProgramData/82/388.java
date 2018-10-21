package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int c = 0;
		int k = 0;
		int l = 0;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] h = new int[50000];
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
				h[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (l = i;l < n;l++)
			{
				if (a[l] >= 90 && a[l] <= 140 && b[l] >= 60 && b[l] <= 90)
				{
					h[i]++;
				}
				else
				{
					i = l;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (h[i] > k)
			{
				k = h[i];
			}
		}

		System.out.printf("%d",k);


		return 0;
	}
}

