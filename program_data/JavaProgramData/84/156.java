package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int d;
		int t;
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (c = 0;c <= (n - 2);c++)
		{
			for (d = (n - 1);d >= (c + 1);d--)
			{
				if (a[d] > a[d - 1])
				{
					t = a[d - 1];
					a[d - 1] = a[d];
					a[d] = t;
				}
			}
		}
		System.out.printf("%d\n",a[0]);
		System.out.printf("%d\n",a[1]);
		return 0;

	}
}

