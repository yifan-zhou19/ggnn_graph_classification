package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] d = new int[100000];
		int i;
		int j;
		int n;
		int t;
		int s;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			d[i] = b[i] + d[i];
		}
		for (i = 0;i < 3;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (d[j] > d[j - 1])
				{
					t = d[j];
					s = a[j];
					d[j] = d[j - 1];
					a[j] = a[j - 1];
					d[j - 1] = t;
					a[j - 1] = s;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",a[i],d[i]);
		}
	}

}

