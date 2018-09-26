package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int[] a = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			for (i = 1;i <= t;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			if ((a[t] + t * 3) < 60)
			{
				System.out.printf("%d\n",60 - t * 3);
			}
			else
			{
				for (i = 1;i <= t;i++)
				{
					if ((a[i] + i * 3 > 62) && (a[i - 1] + i * 3 - 3 < 60))
					{
						System.out.printf("%d\n",63 - 3 * i);
					}
					if (((a[i] + i * 3 <= 62) && (a[i] + i * 3 >= 60)) && ((a[i - 1] + i * 3 - 3) < 60))
					{
						System.out.printf("%d\n",a[i]);
					}
				}
			}
		}
		return 0;
	}

}

