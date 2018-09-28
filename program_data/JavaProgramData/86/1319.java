package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int tem;
		int sum;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - .0.getValue() != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (t == 0)
			{
				System.out.print("60\n");
				continue;
			}
			sum = 0;
			p = 0;
			for (i = 0;i < t;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					tem = Integer.parseInt(tempVar3);
				}
				sum = (i + 1) * 3 + tem;
				if (sum >= 60 && p == 0)
				{
					if (sum <= 63 && p == 0)
					{
						System.out.printf("%d\n",tem);
						p = 1;
					}
					else
					{
						System.out.printf("%d\n",60 - i * 3);
						p = 1;
					}
				}
			}
			if (p == 0)
			{
				if (tem + t * 3 >= 60)
				{
					System.out.printf("%d\n",tem);
				}
				else
				{
					System.out.printf("%d\n",60 - 3 * t);
				}
			}
		}
		return 0;
	}
}

