package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int j;
		int p;
		int q;
		int d;
		int x;
		int[] y = new int[100];
		int k;
		int s;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n;i++,j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}
		for (p = 0;p < n;p++)
		{
			for (i = n - 1,j = n - 1;i > p;i--,j--)
			{
				if (a[i] < a[i - 1])
				{
					q = a[i];
					a[i] = a[i - 1];
					a[i - 1] = q;
					s = b[j];
					b[j] = b[j - 1];
					b[j - 1] = s;
				}
			}
		}
		for (i = 0,j = 0,k = 0;i < n - 1;i++,j++,k++)
		{
			y[0] = b[0];
			if (y[k] >= a[i + 1] != 0 && y[k] >= b[j + 1])
			{
				x = a[0];
				y[k + 1] = y[k];
			}
			else if (y[k] >= a[i + 1] != 0 && y[k] < b[j + 1])
			{
				x = a[0];
				y[k + 1] = b[j + 1];
			}
			if (y[k] < a[i + 1])
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",x,y[n - 1]);
		return 0;
	}

}

