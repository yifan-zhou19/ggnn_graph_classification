package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int max1;
		int max2;
		int b;
		int c;
		int i;
		int j;
		int t;
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
		for (j = 0;j < n - 1;j++)
		{
		for (i = 0;i < n - j - 1;i++)
		{
		if (a[i] < a[i + 1])
		{
			t = a[i];
			a[i] = a[i + 1];
			a[i + 1] = t;
		}
		}
		}
		System.out.printf("%d\n%d\n",a[0],a[1]);
	}

}

