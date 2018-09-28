package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int f;
		int e = 0;
		int maxi = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] > maxi)
			{
				f = maxi;
				maxi = a[i];
			}
			else if (a[i] > e)
			{
				e = a[i];
			}
		}
		System.out.printf("%d\n",maxi);
		if (f > e)
		{
			System.out.printf("%d\n",f);
		}
		else
		{
			System.out.printf("%d\n",e);
		}
		return 0;
	}
}

