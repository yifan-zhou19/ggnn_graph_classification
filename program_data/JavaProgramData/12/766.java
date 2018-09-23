package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int x;
		int y;
		int m;
		int n;
		int[] a = new int[20];
		for (j = 1;j <= 15;j++)
		{
			t = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				y = Integer.parseInt(tempVar);
			}
			if (y == -1)
			{
				break;
			}
			else
			{
				a[0] = y;
				for (i = 1;i <= 20;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						x = Integer.parseInt(tempVar2);
					}
					if (x == 0)
					{
						break;
					}
					else
					{
						a[i] = x;
					}
				}
				for (m = 0;m <= i - 1;m++)
				{
					for (n = 0;n <= i - 1;n++)
					{
						if (a[m] == 2 * a[n])
						{
							t++;
						}
					}
				}
				System.out.printf("%d\n",t);
			}
		}
	}
}

