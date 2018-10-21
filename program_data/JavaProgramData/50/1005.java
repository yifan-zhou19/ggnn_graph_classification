package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void xunzhao(int a[]);
		int i;
		int k;
		int[] a = {5, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		if (k + 5 > 7)
		{
			a[0] = k - 2;
		}
		else
		{
			a[0] = k + 5;
		}
		for (i = 1;i < 12;i++)
		{
		switch (a[i])
		{
			case 3:
				if (a[i - 1] + 3 < 8)
				{
					a[i] = a[i - 1] + 3;
				}
			   else
			   {
				   a[i] = a[i - 1] - 4;
			   }
			   break;
		case 0:
			a[i] = a[i - 1];
			break;
		case 2:
			if (a[i - 1] + 2 < 8)
			{
				a[i] = a[i - 1] + 2;
			}
			   else
			   {
				   a[i] = a[i - 1] - 5;
			   }
			   break;
		}
		}
		xunzhao(a);
	}

	public static void xunzhao(int[] a)
	{
		int i;
		for (i = 0;i < 12;i++)
		{
			if (a[i] == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}
}

