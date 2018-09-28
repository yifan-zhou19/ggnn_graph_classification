package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			int sum;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sum = Integer.parseInt(tempVar2);
			}
			if (sum == 0)
			{
				System.out.print("60\n");
				continue;
			}
			int j;
			int k;
			int[] a = new int[20];
			for (j = 0;j < sum;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 1;j <= sum;j++)
			{
				if (j != sum)
				{
					if (a[j - 1] + j * 3 < 60 && a[j] + (j + 1) * 3 >= 60)
					{
						if (a[j - 1] + j * 3 <= a[j])
						{
							System.out.printf("%d\n",60 - j * 3);
							break;
						}
						else
						{
							System.out.printf("%d\n",a[j]);
							break;
						}
					}
				}
				else
				{
					System.out.printf("%d\n",60 - j * 3);
				}
			}
		}
		return 0;
	}


}

