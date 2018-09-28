package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int t;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (;;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (m == 0 && n == 0)
			{
			break;
			}
			a[m] = a[m] + 1;
			b[n] = b[n] + 1;
		}
		for (i = 0;i < t;i++)
		{
			if (a[i] == 0 && b[i] == t - 1)
			{
				System.out.printf("%d",i);
				m++;
			}
		}
		if (m == 0)
		{
		System.out.print("NOT FOUND");
		}
	}

}

