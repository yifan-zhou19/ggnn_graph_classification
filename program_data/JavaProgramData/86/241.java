package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int pause;
		int t;
		int[] number = new int[60];
		int total;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pause = Integer.parseInt(tempVar2);
			}
			if (pause == 0)
			{
				total = 60;
			}
			else
			{
				for (i = 1;i <= pause;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						number[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 1;i <= pause;)
				{
					t = number[i] + 3 * (i - 1);
					if (t + 3 < 60)
					{
						total = 57 - 3 * (i - 1);
						i = i + 1;
					}
					if (t < 60 && t + 3 >= 60)
					{
						total = number[i];
						break;
					}
					if (t >= 60)
					{
						total = 63 - 3 * i;
						break;
					}
				}
			}
			System.out.printf("%d\n",total);
		}

	}

}

