package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int sum;
		int a;
		int i;
		int min;
		int max;
		int ci;
		int ca;
		float ave;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		min = max = sum = a;
		ci = ca = 1;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a > max)
			{
				max = a;
				ca = 1;
			}
			else if (a == max)
			{
				ca++;
			}
			if (a < min)
			{
				min = a;
				ci = 1;
			}
			else if (a == min)
			{
				ci++;
			}
			sum = sum + a;
		}
		ave = (float)sum / n;
		if (2 * ave > (max + min))
		{
			for (i = 0;i < ci - 1;i++)
			{
				System.out.printf("%d,",min);
			}
			System.out.printf("%d\n",min);
		}
		else if (2 * ave < (max + min))
		{
			for (i = 0;i < ca - 1;i++)
			{
				System.out.printf("%d,",max);
			}
			System.out.printf("%d\n",max);
		}
		else
		{
			for (i = 0;i < ci;i++)
			{
				System.out.printf("%d,",min);
			}
			for (i = 0;i < ca - 1;i++)
			{
				System.out.printf("%d,",max);
			}
			System.out.printf("%d\n",max);
		}
	}
}

