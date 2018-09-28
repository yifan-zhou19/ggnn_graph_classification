package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int k;
		int q;
		int j;
		int l = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		i = 0;
		for (q = 0;q < n;q++)
		{
			if (a[i] == k)
			{
				for (j = i;j < (n - 1);j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
				l++;
			}
			i++;
		}
		for (i = 0;i < n - l;i++)
		{
			if (i < (n - l - 1))
			{
				 System.out.printf("%d ",a[i]);
			}
			if (i == (n - l - 1))
			{
				System.out.printf("%d",a[i]);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			1 = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

