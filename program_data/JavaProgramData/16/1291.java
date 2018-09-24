package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 5;i++)
		{
			a[i] = n % 10;
			n = n / 10;
		}
		if (a[4] == 0 && a[3] == 0 && a[2] == 0 && a[1] == 0)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			if (a[4] == 0 && a[3] == 0 && a[2] == 0)
			{
				System.out.printf("%d%d",a[0],a[1]);
			}
			else
			{
				if (a[4] == 0 && a[3] == 0)
				{
					System.out.printf("%d%d%d",a[0],a[1],a[2]);
				}
				else
				{
					if (a[4] == 0)
					{
						System.out.printf("%d%d%d%d",a[0],a[1],a[2],a[3]);
					}
					else
					{
						System.out.printf("%d%d%d%d%d",a[0],a[1],a[2],a[3],a[4]);
					}
				}
			}
		}
		return 0;
	}
}

