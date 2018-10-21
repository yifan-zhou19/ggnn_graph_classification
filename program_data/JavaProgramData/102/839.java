package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String gender = new String(new char[10]);
		float[] high_male = new float[40];
		float[] high_female = new float[40];
		int counter_male = 0;
		int counter_female = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			gender = ConsoleInput.readToWhiteSpace(true).charAt(0);
			switch (gender.charAt(0))
			{
				case 'f' :
				{
					high_female[counter_female] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
					counter_female++;
					break;
				}
				case 'm' :
				{
					high_male[counter_male] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
					counter_male++;
					break;
				}
			}
		}
		for (int i = 1; i <= counter_male; i++)
		{
			for (int j = 0; j < counter_male - i; j++)
			{
				if (high_male[j] > high_male[j + 1])
				{
					float temp = high_male[j];
					high_male[j] = high_male[j + 1];
					high_male[j + 1] = temp;
				}
			}
		}
		for (int i = 1; i <= counter_female; i++)
		{
			for (int j = 0; j < counter_female - i; j++)
			{
				if (high_female[j] < high_female[j + 1])
				{
					float temp = high_female[j];
					high_female[j] = high_female[j + 1];
					high_female[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < counter_male; i++)
		{
			System.out.printf("%.2f", high_male[i]);
			System.out.printf("%.2f", " ");
		}
		for (int i = 0; i < counter_female-1; i++)
		{
			System.out.printf("%.2f", high_female[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", high_female[counter_female-1]);
		return 0;
	}
}

