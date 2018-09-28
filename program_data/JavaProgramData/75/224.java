package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] a = new int[1000];
		int n = 0;
		int i = 0;
		int j;
		int max = 0;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[n++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}while (c != '\n');
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i++] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}while (c != '\n');
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (x[j] <= i != 0 && y[j]> i)
				{
					a[i]++;
				}
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.printf("%d %d",n,max);
		return 0;
	}
}

