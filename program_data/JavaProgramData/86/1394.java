package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t = 0;
		int num;
		int i;
		int j;
		int k = 0;
		int p = 1;
		int q = 1;
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
			p = 1;
			k = 0;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num = Integer.parseInt(tempVar3);
				}
				k++;
				t = num + 3 * k;
				if (t >= 60 && t - 3 <= 60 && p == 1)
				{
					System.out.printf("%d\n",num);
					p = 0;
				}
				if (t - 3 >= 60 && p == 1)
				{
					System.out.printf("%d\n",60 - (k - 1) * 3);
					p = 0;
				}
			}
			if (t - 3 <= 60 && p == 1)
			{
				System.out.printf("%d\n",60 - 3 * k);
				p = 0;
			}
		}
		return 0;
	}
}

