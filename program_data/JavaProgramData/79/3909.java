package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int j;
		int i;
		int n;
		int m;
		int b;
		int k;
		int start;
		int delenum;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 0 && n == 0)
		{
			break;
		}
		b = n;
		for (i = 0;i < b;i++)
		{
			a[i] = i + 1;
		}
		start = 0;
		for (k = 1;k < b;k++)
		{
			delenum = (start - 1 + m) % n;
			for (j = delenum;j < n - 1;j++)
			{
				a[j] = a[j + 1];
			}
				start = delenum;
				n--;
		}
		System.out.printf("%d\n",a[0]);
		}
	return 0;
	}

}

