package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] num = new int[300];
		int sum = 0;
		int real = 0;
		double aver;
		double cha = 0;
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
			sum = sum + num[i];
		}
		aver = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			cha = (Math.abs(num[i] - aver) > cha)?Math.abs(num[i] - aver):cha;
		}
		for (i = 0;i < n;i++)
		{
			if ((Math.abs(Math.abs(num[i] - aver) - cha) <= 0.00001) && (real == 0))
			{
				System.out.printf("%d",num[i]);
			real = 1;
			}
			else if (Math.abs(Math.abs(num[i] - aver) - cha) <= 0.00001)
			{
				System.out.printf(",%d",num[i]);
			}
		}
	}
}

