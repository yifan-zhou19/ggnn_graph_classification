package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		int[] b = new int[30];
		int[] c = new int[10000];
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
			for (j = 0;j < a[i];j++)
			{
				b[0] = 1;
				b[1] = 1;
				b[j + 2] = b[j] + b[j + 1];
				c[i] = b[j];
			}
		}
		for (k = 0;k < n;k++)
		{
			System.out.printf("%d\n",c[k]);
		}
		return 0;
	}

}

