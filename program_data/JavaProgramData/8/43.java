package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] t = new int[50];
		int[] y = new int[50];
		void str(int t[],int m);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y[i] = Integer.parseInt(tempVar4);
			}
		}
		str(t, m);
		str(y, n);
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",t[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",y[i]);
		}
		System.out.printf("%d\n",y[n - 1]);

	}
	public static void str(int[] t, int m)
	{
		int i;
		int j;
		int c;
		for (i = 0;i < m - 1;i++)
		{
			for (j = i + 1;j <= m - 1;j++)
			{
				if (t[i] > t[j])
				{
					c = t[i];
					t[i] = t[j];
					t[j] = c;
				}
			}
		}
	}






}

