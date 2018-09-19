package <missing>;

public class GlobalMembers
{
	/*
	 * ????first.cpp
	 * ???00948343_??
	 * ?????2012/9/16
	 * ?????1???100?????????
	 */



	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] male = new float[n];
		float[] female = new float[n];
		float height;
		int count_male = 0;
		int count_female = 0;
		String gender = new String(new char[8]);
		for (i = 0;i < n;i++)
		{
			gender = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(gender,"male") == 0)
			{
				male[count_male] = height;
				count_male++;
			}
			else
			{
				female[count_female] = height;
				count_female++;
			}
		}
		float temp;
		for (i = 0;i < count_male-1;i++)
		{
			for (j = 0;j < count_male-1 - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					temp = male[j];
					male[j] = male[j + 1];
					male[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < count_female-1;i++)
		{
			for (j = 0;j < count_female - i - 1;j++)
			{
				if (female[j] < female[j + 1])
				{
					temp = female[j];
					female[j] = female[j + 1];
					female[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < count_male;i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", ' ');
		}
		for (i = 0;i < count_female;i++)
		{
			System.out.printf("%.2f", female[i]);
			if (i != count_female-1)
			{
				System.out.printf("%.2f", ' ');
			}
		}
		return 0;
	}

}

