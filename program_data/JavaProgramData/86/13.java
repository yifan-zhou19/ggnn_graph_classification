package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int e;
		int i;
		int d;
		int[] a = new int[60];
		int m;
		int n;
		int k = 1;
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{

				if ((60 - a[j] - j * 3) * (59 - a[j] - j * 3) * (58 - a[j] - j * 3) == 0)
				{
					System.out.printf("%d\n",a[j]);
					break;
				}
				if ((58 - a[j] - j * 3) < 0)
				{
					System.out.printf("%d\n",(60 - 3 * j));
					break;
				}
			}

			if ((58 - a[j] - j * 3) > 0)
			{
				System.out.printf("%d\n",(60 - 3 * m));
			}
		}


		return 0;
	}

}

