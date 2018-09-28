package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int m;
		int a;
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
			a = 0;
			if (m == 0)
			{
				System.out.print("60\n");
				continue;
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				if (a + j * 3 < 57)
				{
					continue;
				}

				if (a + j * 3 <= 63)
				{
					System.out.printf("%d\n",a);
					break;
				}
				else
				{
					System.out.printf("%d\n",60 - 3 * j);
					break;
				}
			}
			if (j == m)
			{
				System.out.printf("%d\n",60 - 3 * m);
			}
		}
	}

}

