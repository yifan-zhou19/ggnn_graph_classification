package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		int k = 0;
		int[] a = new int[350];
		int[] num = new int[350];
		int[] index = new int[350];
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[j] == a[i])
				{
					p++;
				}
			}
			if (p >= 1 && index[a[i]] == 0)
			{
				num[k] = a[i];
				k++;
				index[a[i]] = 1;
			}
			p = 0;
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",num[i]);
		}
		System.out.printf("%d",num[k - 1]);
	}


}

