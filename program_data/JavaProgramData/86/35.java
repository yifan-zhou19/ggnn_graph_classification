package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int[] p;
		int i;
		int j;
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
				k = Integer.parseInt(tempVar2);
			}
			p = new int[k];
			if (k == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (j = 0;j < k;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[j] = tempVar3;
					}
				}
				if (p[k - 1] + 3 * (k) <= 60)
				{
					System.out.printf("%d\n",60 - k * 3);
				}
				else
				{
					for (j = 0;j < k;j++)
					{
						if (p[j] + 3 * j > 60)
						{
							System.out.printf("%d\n",60 - j * 3);
							break;
						}
						if (p[j] + 3 * (j + 1) > 60)
						{
							System.out.printf("%d\n",p[j]);
							break;
						}
					}
				}
			}
		}
	}



}

