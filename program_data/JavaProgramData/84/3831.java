package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
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
		for (i = 0;i < 2;i++)
		{
			k = i;
			for (j = 1 + i;j < n;j++)
			{
				if (a[j] > a[k])
				{
					k = j;
				}
			}
			if (k != i)
			{
				int t;
				t = a[i];
				a[i] = a[k];
				a[k] = t;
			}
			System.out.printf("%d\n",a[i]);
		}
	}

}

