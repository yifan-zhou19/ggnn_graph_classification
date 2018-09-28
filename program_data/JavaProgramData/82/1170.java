package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int t = 0;
		int z;
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
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] >= 90 && b[i] <= 140 && c[i] >= 60 && c[i] <= 90)
			{
				a[t]++;
			}
			else
			{
					t++;
			}
		}
		for (int p = 0;p < 99;p++)
		{
			if (a[p] > a[p + 1])
			{
				z = a[p + 1];
				a[p + 1] = a[p];
				a[p] = z;
			}
		}
		System.out.printf("%d",a[99]);


		return 0;
	}
}

