package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int b;
		int m;
		int[] y = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			y[j] = 60;
			b = 0;
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
				if (a[i] < (59 - 3 * i))
				{
					b++;
					y[j] = 60 - 3 * b;
				}
				if (a[i] == (59 - 3 * i))
				{
					y[j] = 59 - 3 * i;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			 System.out.printf("%d\n",y[j]);
		}
		return 0;
	}
}

