package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int m;
		int s;
		for (s = 0;s < 10000;s = s + 1)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n > 0 && m > 0)
			{
				int[] a = new int[1000000];
				for (i = 0;i < n;i = i + 1)
				{
					a[i] = i + 1;
				}
				for (l = n;l > 1;l = l - 1)
				{
					if ((m % l - 1) > 0)
					{
					for (i = 0;i < (m % l - 1);i = i + 1)
					{
						 a[l + i] = a[i];
					}
					}
					for (i = 0;i < l;i = i + 1)
					{
						a[i] = a[m % l + i];
					}
				}
				System.out.printf("%d\n",a[0]);
			}
		}
		return 0;
	}


}

