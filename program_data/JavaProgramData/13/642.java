package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int k;
		int j;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (j = 1;j < b;j++)
		{
			for (k = 0;k < j;k++)
			{
			if (a[k] == a[j])
			{
				break;
			}
			}
		if (k == j)
		{
			System.out.printf(" %d",a[j]);
		}
		}
		return 0;
	}
}

