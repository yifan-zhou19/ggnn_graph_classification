package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int group = 0;
		int i;
		int j;
		int amount = 0;
		double[] num;
		double ave = 0;
		double dev = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			group = Integer.parseInt(tempVar);
		}

		for (i = 0; i < group; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				amount = Integer.parseInt(tempVar2);
			}
			num = new double[amount];
			for (j = 0; j < amount; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num + j = tempVar3;
				}
				ave += num[j];
			}
			ave = ave / amount;
			for (j = 0; j < amount; j++)
			{
				dev += (num[j] - ave) * (num[j] - ave);
			}
			dev = Math.sqrt(dev / amount);
			System.out.printf("%.5lf\n", dev);
			dev = 0;
			ave = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(num);
		}

	}
}

