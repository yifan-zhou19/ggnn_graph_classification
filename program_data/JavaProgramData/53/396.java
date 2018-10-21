package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k = 1;
		int j;
		int[] a = new int[300];
		int[] b = new int[300];
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
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < i;j++)
				{
				if (a[i] == a[j])
				{
					break;
				}
				}
				if (j == i)
				{
					b[k] = a[i];
					k = k + 1;
				}
			}
			for (i = 0;i < k - 1;i++)
			{
			System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d",b[k - 1]);
	}

}

