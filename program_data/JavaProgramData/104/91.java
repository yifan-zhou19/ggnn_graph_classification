package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int root = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0] = m;
		b[0] = n;
		for (i = 0;a[i] > 1;i++)
		{
			a[i + 1] = a[i] / 2;
		}
		for (j = 0;b[j] > 1;j++)
		{
			b[j + 1] = b[j] / 2;
		}
		for (i = 0;a[i] > 1;i++)
		{
			for (j = 0;b[j] > 1;j++)
			{
				if (a[i] == b[j])
				{
					root = a[i];
					break;
				}
			}
			if (root != 0)
			{
				break;
			}
		}
		if (root == 0)
		{
			root = 1;
		}
			System.out.printf("%d",root);
	}

}

