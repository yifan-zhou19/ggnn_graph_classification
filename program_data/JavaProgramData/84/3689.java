package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int max = a[0];
		int lmax = a[1];
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] > max)
			{
				max = a[i];
			}
		}

		for (j = 0;j < n;j++)
		{
			if (a[j] > lmax && a[j] < max)
			{
				lmax = a[j];
			}
		}
		System.out.printf("%d\n%d",max,lmax);
		return 0;
	}
}

