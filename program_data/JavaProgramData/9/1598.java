package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int num = 0;
		int[] m = new int[100];
		int j;
		char[][] c = new char[100][10];

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
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}



		for (i = 0;i < n;i++)
		{
			if (a[i] >= 60)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i] >= a[j])
					{
						num = num + 1;
					}
				}
				m[i] = num;
				num = 0;
			}
		}

		for (j = n;j > 0;j--)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] >= 60)
				{
					if (m[i] == j)
					{
						System.out.printf("%s\n",c[i]);
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] < 60)
			{
				System.out.printf("%s\n",c[i]);
			}
		}

		return 0;
	}
}

