package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a;
		int[] b;
		int n;
		int i;
		int j;
		int pd = 0;
		int all;
		int k;
		int m;
		int u;
		int v;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		all = n * (n - 1);
		a = new int[n];
		b = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (i = 0;i < all;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			if ((k != 0) || (m != 0))
			{
				a[k]++;
				b[m]++;
				if ((b[m] == n - 1) && (a[m] == 0))
				{
					System.out.printf("%d",m);
					pd = 1;
				}
			}
			else if ((k == 0) && (m == 0))
			{
				break;
			}
		}
		if (pd == 0)
		{
			System.out.print("NOT FOUND");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
		return 0;
	}
}

