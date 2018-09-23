package <missing>;

public class GlobalMembers
{
	public static float gap(int x,float y)
	{
		float z;
		if (x > y)
		{
			z = x - y;
		}
		else
		{
			z = y - x;
		}
		return z;
	}
	public static void Main()
	{
		int[] num = new int[300];
		float g;
		int n;
		int i;
		int j = 0;
		float ave = 0F;
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
				num[i] = Integer.parseInt(tempVar2);
			}
			ave += num[i];
		}
		ave = ave / n;
		for (i = 0;i < n - 1;i++)
		{
			if (gap(num[i], ave) < gap(num[i + 1], ave) && gap(num[i + 1], ave)> g)
			{
				g = gap(num[i + 1], ave);
			}
			if (gap(num[i], ave) > gap(num[i + 1], ave) && gap(num[i], ave) > g)
			{
				g = gap(num[i], ave);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (gap(num[i], ave) == g)
			{
				System.out.printf("%d",num[i]);
				j = i + 1;
				break;
			}
		}
		for (i = j;i < n;i++)
		{
			if (gap(num[i], ave) == g)
			{
				System.out.printf(",%d",num[i]);
			}
		}
	}

}

