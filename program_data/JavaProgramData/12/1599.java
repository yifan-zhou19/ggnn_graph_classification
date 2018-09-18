package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int d;
		int i;
		int t;
		int p = 0;
		while (true)
		{
			t = 0;
			for (i = 0;i < 100;i = i + 1)
			{
				a[i] = 0;
			}
			while (true)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					d = Integer.parseInt(tempVar);
				}
				if ((d == 0) || (d == -1))
				{
					break;
				}
				a[d] = 1;
			}
			if (d == -1)
			{
				break;
			}
			else
			{
				if (p != 0)
				{
					System.out.print("\n");
				}
				p = p + 1;
			for (i = 1;i < 50;i = i + 1)
			{
						if ((a[i]) && (a[2 * i]))
						{
							t++;
						}
			}
					System.out.printf("%d",t);
			}
		}
		return 0;
	}
}

