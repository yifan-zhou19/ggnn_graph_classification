package <missing>;

public class GlobalMembers
{
	public static float juedui(float x)
	{
		if (x >= 0F)
		{
			return x;
		}
		else
		{
			return (-1 * x);
		}
	}
	public static int Main()
	{
		int[] x = new int[100];
		int n;
		int i;
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
				x[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		float aver = 0F;
		for (i = 1;i <= n;i++)
		{
			aver += x[i - 1];
		}
		aver /= n;
		float max = x[0] - aver;
		for (i = 1;i <= n;i++)
		{
			if (max < juedui(x[i - 1] - aver))
			{
				max = juedui(x[i - 1] - aver);
			}
			else
			{
			}
		}
		int count = 0;
		for (i = 1;i <= n;i++)
		{
			if (juedui(x[i - 1] - aver) == max)
			{
				if (count == 0)
				{
					System.out.printf("%d",x[i - 1]);
				}
				else
				{
					System.out.printf(",%d",x[i - 1]);
				}
				count++;
			}
			else
			{
			}
		}
		return 0;
	}
}

