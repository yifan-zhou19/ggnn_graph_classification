package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] gender = new char[40][10];
		float[] maleheight = new float[40];
		float[] femaleheight = new float[40];
		float temp;
		int num;
		int i;
		int j = 0;
		int k = 0;
		int male = 0;
		int female = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < num; i++)
		{
			gender[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (gender[i][0] == 'm')
			{
				maleheight[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				j++;
				male++;
			}
			else
			{
				femaleheight[k] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				k++;
				female++;
			}
		}
		for (i = 0; i < male; i++)
		{
			for (j = 0; j < male - 1 - i; j++)
			{
				if (maleheight[j] - maleheight[j + 1] > 0F)
				{
					temp = maleheight[j];
					maleheight[j] = maleheight[j + 1];
					maleheight[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < female; i++)
		{
			for (j = 0; j < female - 1 - i; j++)
			{
				if (femaleheight[j] - femaleheight[j + 1] > 0F)
				{
					temp = femaleheight[j];
					femaleheight[j] = femaleheight[j + 1];
					femaleheight[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < male; i++)
		{
			System.out.printf("%.2f", maleheight[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = female - 1; i > 0; i--)
		{
			System.out.printf("%.2f", femaleheight[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", femaleheight[0]);

		return 0;
	}

}

