package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j = 0;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < i;k = k + 1)
			{
				if (a[i] == a[k])
				{
					flag = 1;
				}

			}
			if (flag == 0)
			{
				b[j] = a[i];
				j = j + 1;
			}
			flag = 0;

		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < j;i = i + 1)
		{
			System.out.printf(",%d",b[i]);
		}
	}
}

