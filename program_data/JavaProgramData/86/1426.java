package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int t;
		int num;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			t = 0;
			num = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (k = 0;k < m;k++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[k] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 0;j < m;j++)
				{
					t = a[j] + 3 * (j + 1);
					if (t > 63)
					{
							num = 60 - 3 * j;
							break;
					}
					if (t > 60 && t <= 63)
					{
							num = a[j];
							break;
					}
				}
				if (t <= 60)
				{
					num = 60 - m * 3;
				}
				System.out.printf("%d\n",num);

			}
		}

	return 0;
	}
}

