package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] t = new int[100];
		int n;
		int m;
		int i;
		int j;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		j = n - m;
		for (i = 0;i < m;i++)
		{
			t[i] = a[j];
			j = j + 1;
		}
		h = 0;
		for (i = m;i < n;i++)
		{
			t[i] = a[h];
			h = h + 1;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",t[i]);
		}
		System.out.printf("%d",t[n - 1]);
	}
}

