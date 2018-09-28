package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int k;
		int n;
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
		l = 1;
		for (i = 1;i < n;i++)
		{
			k = 1;
			for (j = 0;j < l;j++)
			{
				if (a[i] == b[j])
				{
					k = 0;
				}
			}
			if (k != 0)
			{
				b[l] = a[i];
				l++;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < l;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		System.out.print('\n');
	}
}

