package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20000];
		int[] b = new int[100];
		int n;
		int i;
		int j;
		int k;
		int l;
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
		b[0] = a[0];
		l = 0;
		k = 0;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j <= l;j++)
			{
				if (a[i] == b[j])
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				l++;
				b[l] = a[i];
			}
			k = 0;
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[l]);
	}
}

