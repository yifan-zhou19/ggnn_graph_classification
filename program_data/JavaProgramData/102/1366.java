package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int f = 0;
		int m = 0;
		float[] height = new float[41];
		float[] female = new float[41];
		float[] male = new float[41];
		final String gender = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			gender = tangible.StringFunctions.changeCharacter(gender, i, ConsoleInput.readToWhiteSpace(true));
			height[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n ;i++)
		{
			if (gender.charAt(i)[0] == 'm')
			{
				male[m++] = height[i];
			}
			else
			{
				female[f++] = height[i];
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < m - 1 - i; j++)
			{
				if (male[j] > male[j + 1])
				{
					double temp = male[j];
					male[j] = male[j + 1];
					male[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < f; i++)
		{
			for (j = 0; j < f - 1 - i; j++)
			{
				if (female[j] < female[j + 1])
				{
					double temp = female[j];
					female[j] = female[j + 1];
					female[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < m; i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 0; i < f - 1; i++)
		{
			System.out.printf("%.2f", female[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", female[f - 1]);
		System.out.printf("%.2f", "\n");
		return 0;
	}


}

