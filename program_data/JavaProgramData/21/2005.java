package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
		int[] n = new int[300];
		int max;
		int min;
		int x;
		int y;
		int i;
		float av = 0F;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  num = Integer.parseInt(tempVar);
			  }
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			av += n[i];
		}
		max = n[0];
		x = 1;
		av /= num;
		for (i = 1;i < num;i++)
		{
		if (n[i] > max)
		{
			max = n[i];
			x = 1;
		}
		else
		{
		if (n[i] == max)
		{
			x++;
		}
		}
		}

		min = n[0];
		y = 1;
		for (i = 1;i < num;i++)
		{
			if (n[i] < min)
			{
				min = n[i];
				y = 1;
			}
			else
			{
				if (min == n[i])
				{
					y++;
				}
			}
		}
		if (min == max)
		{
			System.out.printf("%d",max);
			for (i = 1;i < x;i++)
			{
				System.out.printf(",%d",max);
			}
		}
		else
		{
			if ((max + min) == (2 * av))
			{
				System.out.printf("%d",min);
				for (i = 1;i < y;i++)
				{
					System.out.printf(",%d",min);
				}

				for (i = 0;i < x;i++)
				{
					System.out.printf(",%d",max);
				}
			}
			else
			{
				if ((max + min) > (av * 2))
				{
					System.out.printf("%d",max);
					for (i = 1;i < x;i++)
					{
						System.out.printf(",%d",max);
					}
				}
				else
				{
					System.out.printf("%d",min);
					for (i = 1;i < y;i++)
					{
						System.out.printf(",%d",min);
					}
				}
			}
		}
	}
}

