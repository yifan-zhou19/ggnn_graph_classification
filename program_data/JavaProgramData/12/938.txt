package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] su = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] c = new int[100];
		int i;
		int a;
		int b;
		int d;
		int e = 0;
		for (i = 0;i < 100;i++)
		{
			c[i] = 0;
		}
		for (d = 0;d < 100;d++)
		{
			a = 0;
			for (i = 1;su[i - 1] != 0;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					su[i] = Integer.parseInt(tempVar);
				}
				if (su[i] == -1)
				{
					e = 1;
					break;
				}
				a = a + 1;
			}
			if (e != 0)
			{
				break;
			}
			for (i = 1;i < a;i++)
			{
				for (b = 1;b < a;b++)
				{
					if (su[i] == 2 * su[b])
					{
						c[d] += 1;
					}
				}
			}
		}
		for (i = 0;i < d;i++)
		{
				System.out.printf("%d\n",c[i]);
		}


		return 0;

	}
}

