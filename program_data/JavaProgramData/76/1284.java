package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
					m = b[j];
					b[j] = b[j + 1];
					b[j + 1] = m;
				}
			}
		}
		m = b[0];
		for (i = 0;i < n - 1;i++)
		{
			if (m < a[i + 1])
			{
				System.out.print("no");
								break;
			}
			else
			{
				if (m < b[i + 1])
				{
					m = b[i + 1];
				}
			}
		}
			 if (i == n - 1)
			 {
		System.out.printf("%d %d",a[0],m);
			 }
		return 0;
	}
}

