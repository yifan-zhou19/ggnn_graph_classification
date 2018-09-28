package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
				System.out.print("End\n");
		}
		a[1] = n;
		if (n != 1)
		{
			for (i = 1; ;i++)
			{
			if (a[i] % 2 == 0)
			{
				a[i + 1] = a[i] / 2;
				System.out.printf("%d/2=%d\n",a[i],a[i + 1]);
				if (a[i + 1] == 1)
				{
					break;
				}
			}
			if (a[i] % 2 != 0)
			{
				if (a[i] == 1)
				{
					break;
				}
				a[i + 1] = a[i] * 3 + 1;
				System.out.printf("%d*3+1=%d\n",a[i],a[i + 1]);
			}
			}
				System.out.print("End\n");
		}
		return 0;
	}


}

