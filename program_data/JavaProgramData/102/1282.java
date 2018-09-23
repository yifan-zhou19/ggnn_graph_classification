package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int count1 = 0;
		int count2 = 0;
		float[] male = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		float[] female = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		final String judge = "";
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				judge = tempVar2.charAt(0);
			}
			if (judge.charAt(0) == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					male[count1] = Float.parseFloat(tempVar3);
				}
				count1++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					female[count2] = Float.parseFloat(tempVar4);
				}
				count2++;
			}
		}
		for (int i = 0;i < count1;i++)
		{
			for (int j = i + 1;j < count1;j++)
			{
				float temp = 0.0F;
				if (male[i] > male[j])
				{
				   temp = male[i];
				   male[i] = male[j];
				   male[j] = temp;
				}
			}
		}
		for (int i = 0;i < count2;i++)
		{
			for (int j = i + 1;j < count2;j++)
			{
				float temp = 0.0F;
				if (female[i] < female[j])
				{
				   temp = female[i];
				   female[i] = female[j];
				   female[j] = temp;
				}
			}
		}
		System.out.printf("%.2f",male[0]);
		for (int i = 1;i < count1;i++)
		{
			System.out.printf(" %.2f",male[i]);
		}
		for (int i = 0;i < count2;i++)
		{
			System.out.printf(" %.2f",female[i]);
		}
	}
}

