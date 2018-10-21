package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[20];
		int n;
		int x;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			if (x == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				for (j = 0;j < x;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						num[j] = Integer.parseInt(tempVar3);
					}
				}
				j--;
				if (num[j] + (j + 1) * 3 <= 60)
				{
					System.out.printf("%d\n",60 - (j + 1) * 3);
					continue;
				}
				else
				{
					j--;
				}
				for (;j >= 0;j--)
				{
					if (num[j] + (j + 1) * 3 > 60)
					{
						continue;
					}
					else
					{
						m = 60 - (j + 1) * 3;
						if (m <= num[j + 1])
						{
							System.out.printf("%d\n",m);
							break;
						}
						else
						{
							System.out.printf("%d\n",num[j + 1]);
							break;
						}
					}
				}
			}
		}
	}

}

