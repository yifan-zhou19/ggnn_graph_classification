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
			int leiji;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				leiji = Integer.parseInt(tempVar2);
			}


			if (leiji == 0)
			{
				System.out.print("60\n");
			}



			else
			{
				int j;
				int[] stop = new int[60];
				for (j = 1;j <= leiji;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						stop[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = leiji;j > 0;j--)
				{
					int time = stop[j] + 3 * j;
					int time1 = stop[j] + 3 * j - 3;
					if (time1 <= 60 && time >= 60)
					{
						System.out.printf("%d\n",stop[j]);
					}
					else if (time < 60)
					{
						System.out.printf("%d\n",60 - 3 * j);
					}
					if (time1 <= 60 && time >= 60)
					{
						break;
					}
					else if (time < 60)
					{
						break;
					}
				}
			}



		}
		return 0;
	}
}

