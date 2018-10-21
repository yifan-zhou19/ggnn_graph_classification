package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int index_male = 0;
		int index_female = 0;
		String sex = new String(new char[10]);
		float[] male;
		float[] female;
		float temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		male = new float[n];
		female = new float[n];
		for (i = 0;i < n;i++)
		{
			male[i] = 0F;
			female[i] = 0F;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			if (strcmp(sex,"male") == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					temp = Float.parseFloat(tempVar3);
				}
				male[index_male] = temp;
				index_male++;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					temp = Float.parseFloat(tempVar4);
				}
				female[index_female] = temp;
				index_female++;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					temp = male[j];
					male[j] = male[j + 1];
					male[j + 1] = temp;
				}
				if (female[j] < female[j + 1])
				{
					temp = female[j];
					female[j] = female[j + 1];
					female[j + 1] = temp;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (male[i] != 0F)
			{
				System.out.printf("%3.2f",male[i]);
			}
			if (male[i] != 0F && i + 1 < n && male[i + 1] != 0F)
			{
				System.out.print(" ");
			}
		}
			 System.out.print(" ");
		for (i = 0;i < n;i++)
		{
			if (female[i] != 0F)
			{
				System.out.printf("%3.2f",female[i]);
			}
			if (female[i] != 0F && i + 1 < n && female[i + 1] != 0F)
			{
				System.out.print(" ");
			}
		}

	}
}

