package <missing>;

public class GlobalMembers
{
	public static int[] missle = new int[25];
	public static int n;
	public static int Intercept(int i,int j)
	{
		int k;
		int max = 1;
		int sum = 1;
		for (k = i + 1;k < j;k++)
		{
			if (missle[k] <= missle[i] != 0 && missle[k] >= missle[j])
			{
				sum = Intercept(k, j) + 1;
			}
			else
			{
				continue;
			}
			if (sum > max)
			{
				max = sum;
			}
			sum = 1;
		}
		return max;
	}
	public static void Main()
	{
		int i;
		int j;
		int max = 1;
		int sum = 0;
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
				missle[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (missle[j] <= missle[i])
				{
					sum = Intercept(i, j) + 1;
				}
				else
				{
					continue;
				}
				if (sum > max)
				{
					max = sum;
				}
				sum = 0;
			}
		}
		System.out.printf("%d\n",max);
	}


}

