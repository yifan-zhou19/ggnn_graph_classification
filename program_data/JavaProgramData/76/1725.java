package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int p;
		int k;
		int[] a = new int[50000];
		int[] b = new int[50000];
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
		for (k = 1;k <= n;k++)
		{
		for (i = 0;i < n - k;i++)
		{
			if (a[i] > a[i + 1])
			{
				e = a[i + 1];
				p = b[i + 1];
				a[i + 1] = a[i];
				b[i + 1] = b[i];
				a[i] = e;
				b[i] = p;
			}
		}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i + 1] > b[i])
			{
				System.out.print("no");
							i++;
				break;
			}
			else if (b[i + 1] < b[i])
			{
				b[i + 1] = b[i];
			}
		}
		if (a[i] <= b[i - 1])
		{
			if (b[i] > b[i - 1])
			{
			System.out.printf("%d %d",a[0],b[i]);
			}
			else
			{
				System.out.printf("%d %d",a[0],b[i - 1]);
			}
		}

		return 0;
	}

}

