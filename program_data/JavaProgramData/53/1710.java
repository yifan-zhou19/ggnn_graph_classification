package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int d;
		int[] a = new int[300];
		int i;
		int l = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k != 0)
		{
			k = k - 1;
			p = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < l;i = i + 1)
			{
				if (d == a[i]) //??????
				{
					p = 1;
					break;
				}
			}
			if (p == 0)
			{
				a[l] = d; //a[i]???????????
				l++;
			}
		}
		for (i = 0;i < l - 1;i = i + 1)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[l - 1]);
		return 0;
	}

}

