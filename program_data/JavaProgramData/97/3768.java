package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 6;i++)
		{
			b[i] = 0;
		}
		for (k = 0;k < 6;k++)
		{
			for (i = 0;n >= a[k];i++)
			{
				n = n - a[k];
				b[k] += 1;
			}
		}
		for (i = 0;i < 6;i++)
		{
		   System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

