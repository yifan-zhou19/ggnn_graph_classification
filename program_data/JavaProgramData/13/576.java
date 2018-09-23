package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[20000];
		int p = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < i;j++)
			{
				if (m == a[j])
				{
					p = 0;
					break;
				}
			}
			if (p == 0)
			{
				i--;
				n--;
				p = 1;
			}
			else
			{
				a[i] = m;
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d ",a[j]);
		}
		System.out.printf("%d",a[n - 1]);
		return 0;
	}
}

