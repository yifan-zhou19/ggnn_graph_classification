package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sex = new char[40][7];
		double[] height = new double[40];
		double[] male = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double[] female = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int n;
		int num_male;
		int num_female;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j = 0;
		int k = 0;
		double temp;
		for (i = 0; i < n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(sex[i],"male") == 0)
			{
				male[j] = height[i];
				j++;
			}
			else
			{
				female[k] = height[i];
				k++;
			}
		}
		for (num_male = 0; num_male < n; num_male++)
		{
			if (male[num_male] <= 0)
			{
				break;
			}
		}
		for (num_female = 0; num_female < n; num_female++)
		{
			if (female[num_female] <= 0)
			{
				break;
			}
		}
		for (i = 0; i < num_male - 1; i++)
		{
			for (j = 0; j < num_male - i - 1; j++)
			{
				if (male[j] > male[j + 1])
				{
					temp = male[j];
					male[j] = male[j + 1];
					male[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < num_female - 1; i++)
		{
			for (j = 0; j < num_female - i - 1; j++)
			{
				if (female[j] > female[j + 1])
				{
					temp = female[j];
					female[j] = female[j + 1];
					female[j + 1] = temp;
				}
			}
		}
		System.out.printf("%.2f", male[0]);
		for (i = 1; i < num_male; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", male[i]);
		}
		for (i = (num_female - 1); i >= 0; i--)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", female[i]);
		}
		return 0;
	}



}

