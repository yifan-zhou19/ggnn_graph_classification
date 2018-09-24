package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count_male = 0;
		int count_female = 39;
		int emp;
		String sex = new String(new char[7]);
		double[] hight = new double[40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(sex, "female"))
			{
				hight[count_male++] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				hight[count_female--] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < count_male; i++)
		{
			emp = 0;
			for (j = 1; j < count_male; j++)
			{
				if (hight[j] <= hight[emp])
				{
					emp = j;
				}
			}
			System.out.printf("%.2f", hight[emp]);
			System.out.printf("%.2f", " ");
			hight[emp] = 3;
		}
		for (i = 39; i > count_female; i--)
		{
			emp = 39;
			for (j = 38; j > count_female; j--)
			{
				if (hight[j] >= hight[emp])
				{
					emp = j;
				}
			}
			System.out.printf("%.2f", hight[emp]);
			if (i != count_female+1)
			{
				System.out.printf("%.2f", " ");
			}
			hight[emp] = 0;
		}
	return 0;
	}
}

