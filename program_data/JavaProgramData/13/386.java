package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20000];
		int i = 0;
		int n;
		int j;
		int k;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Integer.parseInt(tempVar2);
			}
		}
		k = 0;
		while (i < n)
		{
			for (j = 0;j < i;)
			{
				if (a[i] == a[j])
				{
					m = 0;
					break;
				}
				else
				{
					j++;
				}
			}
			if (m == 1)
			{
				a[k] = a[i];
				i++,k++;
			}
			else
			{
				i++,m = 1;
			}
		}
		for (i = 0;i < (k - 1);i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d\n",a[k - 1]);
	}
}

