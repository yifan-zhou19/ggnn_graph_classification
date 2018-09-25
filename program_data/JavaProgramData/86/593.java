package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int counts;
		int sum;
		int[] a = new int[100];
		int n;
		int i;
		int c;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			c = 0;
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < m;i++)
			{
				c = 3 * m;
				if (a[i] + i * 3 > 60)
				{
					c = i * 3;
					break;
				}
				else if (a[i] + (i + 1) * 3 > 60)
				{
					c = 60 - a[i];
					break;
				}
			}
			System.out.printf("%d\n",60 - c);
		}
	}
}

