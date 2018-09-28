package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50001];
		int[] b = new int[50001];
		int n;
		int i;
		int k;
		int e;
		int t;
		int s;
		int flag = 0;
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
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i + 1] <= b[i])
			{
				if (b[i] > b[i + 1])
				{
					b[i + 1] = b[i];
					continue;
				}
			}
			else
			{
				flag = 1;
				System.out.print("no");
				break;
			}
		}
		if (flag == 0)
		{
			System.out.printf("%d %d",a[0],b[i]);
		}
		return 0;

	}


}

