package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int j;
		int l;
		int k;
		int i = 1;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			a[0] = 1;
			a[1] = 1;
			if (x == 1 || x == 2)
			{
				System.out.print("1");
			}
			else
			{
				j = 2;
				while (j < x)
				{
					a[j] = a[j - 1] + a[j - 2];
					j++;
				}
				System.out.printf("%d\n",a[j - 1]);
			}
			i++;
		}
		return 0;
	}
}

