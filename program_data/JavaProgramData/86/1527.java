package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int x;
		int t;
		int[] a = new int[N];
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			a[i] = 0;
			t = 0;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x = Integer.parseInt(tempVar3);
				}
				x = x - a[i];
				if (t + x >= 60)
				{
					a[i] = a[i] + 60 - t;
					t = 60;
				}
				else if (t + x < 60 && t + x + 3 >= 60)
				{
					t = 60;
					a[i] = a[i] + x;
				}
				else if (t + x + 3 < 60)
				{
					t = t + x + 3;
					a[i] = a[i] + x;
				}

			}

			a[i] = a[i] + (60 - t);
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",a[i]);
		}

		return 0;
	}

}

